package com.whitecloak.orikamapper.mapper;

import com.whitecloak.orikamapper.entity.SourceEntity;
import com.whitecloak.orikamapper.model.Source;

public interface SourceMapper {

    Source mapEntityToModel(SourceEntity sourceEntity);

    SourceEntity mapModelToEntity(Source source);

}
