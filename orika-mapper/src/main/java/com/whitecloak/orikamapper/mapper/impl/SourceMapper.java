package com.whitecloak.orikamapper.mapper.impl;

import com.whitecloak.orikamapper.entity.SourceEntity;
import com.whitecloak.orikamapper.model.Source;

public interface SourceMapper {

     Source map(SourceEntity sourceEntity);

     SourceEntity map(Source source);
}
