package com.example.services.external;

import com.example.models.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("NOUN")
public interface NounService {

    @GetMapping("/")
    Word getWord();
}
