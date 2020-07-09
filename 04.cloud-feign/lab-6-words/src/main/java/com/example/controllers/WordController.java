package com.example.controllers;

import com.example.models.Word;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WordController {

    private final Random random = new Random();

    @Value("${words}")
    private String[] words;

    @GetMapping("/")
    public Word getWord() {
        return new Word(words[random.nextInt(words.length)]);
    }
}
