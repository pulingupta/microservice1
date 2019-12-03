package com.api.service1.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "This Hello Resource", description = "compiles and return hello world resource")
public class HelloResource {

    @ApiOperation(value = "returns kela service")
    @GetMapping
    public String hello() {
        return "Hello world";
    }

    @ApiOperation(value = "submits kela service")
    @PostMapping(value = "/rest/hello")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @ApiOperation(value = "puts kela service")
    @PutMapping(value = "/rest/hello")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }

}