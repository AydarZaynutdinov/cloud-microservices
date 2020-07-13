package com.example.controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "word-config")
public class Controller {

    private String luckyWord;

    @GetMapping("/lucky-word")
    public String printLuckyWord() {
        return "<h3>The lucky word is:</h3><br><br>" + luckyWord;
    }

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }
}
