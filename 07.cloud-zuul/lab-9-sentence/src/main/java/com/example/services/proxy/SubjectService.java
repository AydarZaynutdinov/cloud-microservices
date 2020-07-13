package com.example.services.proxy;

import com.example.models.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SUBJECT")
public interface SubjectService {

    @GetMapping("/")
    Word getWord();
}
