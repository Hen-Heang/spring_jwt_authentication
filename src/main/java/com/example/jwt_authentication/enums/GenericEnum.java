package com.example.jwt_authentication.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public interface GenericEnum<T, E> {

    @JsonValue
    E getValue();

    String getLabel();
}
