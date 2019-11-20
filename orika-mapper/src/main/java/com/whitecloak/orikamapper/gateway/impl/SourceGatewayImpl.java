package com.whitecloak.orikamapper.gateway.impl;

import com.whitecloak.orikamapper.gateway.SourceGateway;
import com.whitecloak.orikamapper.mapper.SourceMapper;
import com.whitecloak.orikamapper.model.Source;
import com.whitecloak.orikamapper.repository.SourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class SourceGatewayImpl implements SourceGateway {

    private final SourceMapper sourceMapper;
    private final SourceRepository sourceRepository;

    @Override
    public List<Source> fetchAllByAge(int age) {

        return sourceRepository.fetchAllByAge(age)
                .stream()
                .map(sourceMapper::mapEntityToModel)
                .collect(Collectors.toList());
    }
}
