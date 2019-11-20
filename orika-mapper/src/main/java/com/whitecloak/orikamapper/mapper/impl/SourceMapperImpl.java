package com.whitecloak.orikamapper.mapper.impl;

import com.whitecloak.orikamapper.entity.SourceEntity;
import com.whitecloak.orikamapper.mapper.SourceMapper;
import com.whitecloak.orikamapper.model.Source;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Service;

@Service
public class SourceMapperImpl implements SourceMapper {

    private MapperFactory mapperFactory;

    public SourceMapperImpl() {

        mapperFactory = new DefaultMapperFactory.Builder().build();
    }

    @Override
    public Source mapEntityToModel(SourceEntity sourceEntity) {
        return mapperFactory
                .getMapperFacade()
                .map(sourceEntity, Source.class);

    }

    @Override
    public SourceEntity mapModelToEntity(Source source) {
        return mapperFactory
                .getMapperFacade()
                .map(source, SourceEntity.class);
    }
}
