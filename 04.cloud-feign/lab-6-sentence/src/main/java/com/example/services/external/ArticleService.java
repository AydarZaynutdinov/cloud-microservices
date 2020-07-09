package com.example.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ADJECTIVE")
public interface ArticleService {

    @GetMapping("/")
    void getWord();
}
