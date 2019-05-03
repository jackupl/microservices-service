package com.microservices.controller;

import com.microservices.dto.ServiceResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SimpleControllerTest {


    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void controller_should_return_configured_message() {
        // given

        // when
        final ResponseEntity<ServiceResponse> response = restTemplate.getForEntity("/v1/service", ServiceResponse.class);

        // then
        assertThat(response.getBody()).isEqualTo(ServiceResponse.builder()
                .response("Simple Service Response body")
                .build());
    }

}