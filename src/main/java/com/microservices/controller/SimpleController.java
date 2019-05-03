package com.microservices.controller;


import com.microservices.dto.ServiceResponse;
import com.microservices.service.SimpleService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/service", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SimpleController {


    private final SimpleService simpleService;

    public SimpleController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }


    @GetMapping
    @ApiOperation("Returns some response")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public ServiceResponse hello() {
        return simpleService.getResponse();
    }
}
