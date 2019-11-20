package com.whitecloak.orikamapper.mapper.impl;

import com.whitecloak.orikamapper.entity.SourceEntity;
import com.whitecloak.orikamapper.model.Source;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SourceMapperImplTests {

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @InjectMocks
    SourceMapperImpl sourceMapper;

    @InjectMocks
    Source source = new Source();

    @InjectMocks
    SourceEntity sourceEntity = new SourceEntity();

    @Test
    public void whenMapEntityToModel_thenCorrect() {

        sourceEntity.setName("Errolito");
        sourceEntity.setAge(9);

        Source source = sourceMapper.mapEntityToModel(sourceEntity);

        assertEquals(source, new Source(
                "Errolito",
                9
        ));
    }

    @Test
    public void whenMapModelToEntity_thenCorrect() {

        source.setName("Errolito");
        source.setAge(9);

        SourceEntity sourceEntity = sourceMapper.mapModelToEntity(source);

        assertEquals(sourceEntity, new SourceEntity(
                "Errolito",
                9
        ));
    }
}
