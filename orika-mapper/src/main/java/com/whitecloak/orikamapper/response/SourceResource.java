package com.whitecloak.orikamapper.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.whitecloak.orikamapper.model.Error;
import com.whitecloak.orikamapper.model.Source;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceResource {

    private List<Source> sources;
    private List<Error> errors;
}
