package com.microservices.service;


import com.microservices.dto.ServiceResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SimpleServiceTest {

    @InjectMocks
    private SimpleService simpleService;

    @Test
    public void should_return_configured_message() {
        // given

        // when
        final ServiceResponse response = simpleService.getResponse();

        // then
        assertThat(response).isEqualTo(ServiceResponse.builder()
                .response("Simple Service Response body")
                .build());
    }

}