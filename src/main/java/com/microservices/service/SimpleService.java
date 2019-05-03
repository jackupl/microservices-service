package com.microservices.service;

import com.microservices.dto.ServiceResponse;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    public ServiceResponse getResponse() {
        return ServiceResponse.builder()
                .response("Simple Service Response body")
                .build();
    }
}
