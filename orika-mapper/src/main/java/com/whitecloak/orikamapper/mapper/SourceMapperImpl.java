package com.whitecloak.orikamapper.mapper;

import com.whitecloak.orikamapper.entity.SourceEntity;
import com.whitecloak.orikamapper.mapper.impl.SourceMapper;
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
    public Source map(SourceEntity sourceEntity) {
        return mapperFactory
                .getMapperFacade()
                .map(sourceEntity, Source.class);

    }

    @Override
    public SourceEntity map(Source source) {
        return mapperFactory
                .getMapperFacade()
                .map(source, SourceEntity.class);
    }
}
