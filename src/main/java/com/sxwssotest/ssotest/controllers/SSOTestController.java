package com.sxwssotest.ssotest.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSOTestController {

    @GetMapping(value = "/")
    public String test(@RequestHeader Map<String, String> headers) {
        StringBuilder sb = new StringBuilder("");

        headers.forEach((k,v) -> sb.append(k + ":" + v + "\r\n"));

        return sb.toString();
    }
    
}
