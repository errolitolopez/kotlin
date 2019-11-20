package com.whitecloak.orikamapper.repository.impl;

import com.whitecloak.orikamapper.entity.SourceEntity;
import com.whitecloak.orikamapper.repository.SourceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SourceRepositoryImpl implements SourceRepository {

    @Override
    public List<SourceEntity> fetchAllByAge(int age) {
        List<SourceEntity> sourceEntities = new ArrayList<>();
        sourceEntities.add(new SourceEntity(null, 0));
        sourceEntities.add(new SourceEntity("Elliott", 26));
        sourceEntities.add(new SourceEntity("Oliver", 34));
        sourceEntities.add(new SourceEntity("Marvin", 28));
        sourceEntities.add(new SourceEntity("Samuel", 56));
        sourceEntities.add(new SourceEntity("Elliott", 37));
        sourceEntities.add(new SourceEntity("Hiram", 23));
        sourceEntities.add(new SourceEntity("Michael", 48));
        sourceEntities.add(new SourceEntity("Castor", 63));
        sourceEntities.add(new SourceEntity("Joseph", 56));
        sourceEntities.add(new SourceEntity("Alfonso", 59));


        return sourceEntities
                .stream()
                .filter(p -> p.getAge() >= age)
                .collect(Collectors.toList());
    }
}
