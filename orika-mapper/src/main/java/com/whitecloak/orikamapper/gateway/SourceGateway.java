package com.whitecloak.orikamapper.gateway;

import com.whitecloak.orikamapper.model.Source;

import java.util.List;

public interface SourceGateway {

    List<Source> fetchAllByAge(int age);
}
