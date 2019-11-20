package com.whitecloak.orikamapper.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SourceError {

    UNDERAGE(100, "UNDERAGE");

    private final int code;
    private final String message;
}
