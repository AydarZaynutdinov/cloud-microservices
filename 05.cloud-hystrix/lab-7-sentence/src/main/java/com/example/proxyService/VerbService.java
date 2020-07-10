package com.example.proxyService;

import com.example.model.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("VERB")
public interface VerbService {

    @GetMapping("/")
    Word getWord();
}
