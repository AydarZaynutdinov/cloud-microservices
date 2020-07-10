package com.example.proxyService;

import com.example.model.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ADJECTIVE")
public interface AdjectiveService {

    @GetMapping("/")
    Word getWord();
}
