package com.whitecloak.orikamapper.service.impl;

import com.whitecloak.orikamapper.constant.SourceError;
import com.whitecloak.orikamapper.model.Error;
import com.whitecloak.orikamapper.model.Source;
import com.whitecloak.orikamapper.request.SourceForm;
import com.whitecloak.orikamapper.response.SourceResource;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class SourceServiceImplTests {

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    SourceServiceImpl sourceService;

    @Test
    public void fetchAllByAge_ageIsMoreThan17_thenReturnSourceResource() {

        List<Source> actual = new ArrayList<>();
        actual.add(new Source("Oliver", 34));
        actual.add(new Source("Marvin", 28));
        actual.add(new Source("Samuel", 56));

        SourceResource sourceResource = new SourceResource();
        sourceResource.setSources(actual);

        assertNull(sourceResource.getErrors());

        SourceForm sourceForm = new SourceForm();
        sourceForm.setAge(18);

        assertTrue(sourceForm.getAge() >= 18);

        when(sourceService.fetchAllByAge(sourceForm)).thenReturn(sourceResource);

        List<Source> expected = new ArrayList<>();
        expected.add(new Source("Oliver", 34));
        expected.add(new Source("Marvin", 28));
        expected.add(new Source("Samuel", 56));

        assertEquals(actual, expected);
        assertEquals(3, sourceResource.getSources().size());
    }


    @Test
    public void fetchAllByAge_ageIsLessThan17_thenReturnErrors() {

        SourceForm sourceForm = new SourceForm();
        sourceForm.setAge(17);
        assertTrue(sourceForm.getAge() <= 17);

        Error error = new Error();
        error.setCode(SourceError.UNDERAGE.getCode());
        error.setMessage(SourceError.UNDERAGE.getMessage());

        List<Error> errors = new ArrayList<>();
        errors.add(error);

        SourceResource actual = new SourceResource();
        actual.setErrors(errors);

        assertNull(actual.getSources());

        when(sourceService.fetchAllByAge(sourceForm)).thenReturn(actual);

        assertEquals(1, actual.getErrors().size());
    }
}