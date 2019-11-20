package com.whitecloak.orikamapper.service.impl;

import com.whitecloak.orikamapper.constant.SourceError;
import com.whitecloak.orikamapper.gateway.SourceGateway;
import com.whitecloak.orikamapper.model.Error;
import com.whitecloak.orikamapper.model.Source;
import com.whitecloak.orikamapper.request.SourceForm;
import com.whitecloak.orikamapper.response.SourceResource;
import com.whitecloak.orikamapper.service.SourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class SourceServiceImpl implements SourceService {

    private final SourceGateway sourceGateway;

    @Override
    public SourceResource fetchAllByAge(SourceForm sourceForm) {

        SourceResource sourceResource = new SourceResource();

        List<Source> sources = sourceGateway.fetchAllByAge(sourceForm.getAge());

        if (sourceForm.getAge() <= 17) {


            List<Error> errors = new ArrayList<>();
            errors.add(new Error(
                    SourceError.UNDERAGE.getCode(),
                    SourceError.UNDERAGE.getMessage()
            ));

            sourceResource.setErrors(errors);
            return sourceResource;
        }

        sourceResource.setSources(sources);
        return sourceResource;
    }
}
