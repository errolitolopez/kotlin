package com.whitecloak.orikamapper.mapper.impl;

import com.whitecloak.orikamapper.entity.SourceEntity;
import com.whitecloak.orikamapper.mapper.SourceMapperImpl;
import com.whitecloak.orikamapper.model.Source;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class SourceMapperImplTests {

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

        Source source = sourceMapper.map(sourceEntity);

        assertEquals(source, new Source(
                "Errolito",
                9
        ));
    }

    @Test
    public void whenMapModelToEntity_thenCorrect() {

        source.setName("Errolito");
        source.setAge(9);

        SourceEntity sourceEntity = sourceMapper.map(source);

        assertEquals(sourceEntity, new SourceEntity(
                "Errolito",
                9
        ));
    }
}
