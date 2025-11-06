package com.cloud.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.service1.service.OpenFeignService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/service1")
@RequiredArgsConstructor
public class Controller {

    private final OpenFeignService feignService;

    @GetMapping("/check")
    public String check() {
        return "service1";
    }

    @GetMapping("/check-openfeign")
    public String checkOpenfeign() {
        return feignService.getData();
    }
}
