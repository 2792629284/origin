package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springSecurity")
public class springSecurityController {
    @RequestMapping("/test")
    public String test(){
        return "hello";
    }
}
