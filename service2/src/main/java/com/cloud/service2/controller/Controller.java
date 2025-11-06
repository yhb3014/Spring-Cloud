package com.cloud.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class Controller {

    @GetMapping("/check")
    public String check() {
        return "service2";
    }

    @GetMapping("/check2")
    public String check2() {
        return "feign test";
    }
}
