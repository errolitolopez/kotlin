package com.whitecloak.orikamapper.repository;

import com.whitecloak.orikamapper.entity.SourceEntity;

import java.util.List;

public interface SourceRepository {

    List<SourceEntity> fetchAllByAge(int age);
}
