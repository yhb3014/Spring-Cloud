package com.cloud.service1.service;

import org.springframework.stereotype.Service;

import com.cloud.service1.feign.OpenFeignClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OpenFeignService {

    private final OpenFeignClient feignClient;

    public String getData() {
        return feignClient.check2();
    }
}
