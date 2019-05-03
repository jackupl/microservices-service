package com.microservices.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
@Builder
@EqualsAndHashCode
public class ServiceResponse {

    private final String response;

    @JsonCreator
    public ServiceResponse(@JsonProperty("response") final String response) {
        this.response = response;
    }
}
