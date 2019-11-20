package com.whitecloak.orikamapper.service;

import com.whitecloak.orikamapper.request.SourceForm;
import com.whitecloak.orikamapper.response.SourceResource;

public interface SourceService {

    SourceResource fetchAllByAge(SourceForm sourceForm);
}
