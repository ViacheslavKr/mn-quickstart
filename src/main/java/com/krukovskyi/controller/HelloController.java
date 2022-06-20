package com.krukovskyi.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {
    @Get(processes = MediaType.TEXT_PLAIN)
    public String helloWorld(){
        return "Hello World";
    }
}
