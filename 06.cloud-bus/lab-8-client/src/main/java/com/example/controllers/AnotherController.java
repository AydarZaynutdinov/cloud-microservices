package com.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AnotherController {

    @Value("${word-config.lucky-word}")
    private String luckyWord;

    @GetMapping("/scope/lucky-word")
    public String printLuckyWord() {
        return "<h3>The lucky word from refreshScope is:</h3><br><br>" + luckyWord;
    }
}
