package com.example.bookercommonservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ACCOUNT-SERVICE")
public interface UserProxy {
    @GetMapping("/api/v1/account/email/ref/{ref}")
    String findEmailByRef(@PathVariable String ref);
}
