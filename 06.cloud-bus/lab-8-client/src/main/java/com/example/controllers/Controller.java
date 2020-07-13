package com.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${lucky-word}")
    private String luckyWord;

    @GetMapping
    public String getLuckyWord() {
        return "<h3>The lucky word is:</h3><br><br>" + luckyWord;
    }
}
