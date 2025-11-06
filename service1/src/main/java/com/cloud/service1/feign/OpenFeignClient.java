package com.cloud.service1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service2")
public interface OpenFeignClient {

    @GetMapping("/service2/check2")
    String check2();
}
