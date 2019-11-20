package com.whitecloak.orikamapper.controller;

import com.whitecloak.orikamapper.request.SourceForm;
import com.whitecloak.orikamapper.response.SourceResource;
import com.whitecloak.orikamapper.service.SourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class SourceController {

    private final SourceService sourceService;

    @RequestMapping(method = RequestMethod.GET, value = "")
    @ResponseStatus(HttpStatus.OK)
    public SourceResource fetchAllByAge(@Valid @RequestBody SourceForm sourceForm) {

        return sourceService.fetchAllByAge(sourceForm);
    }
}
