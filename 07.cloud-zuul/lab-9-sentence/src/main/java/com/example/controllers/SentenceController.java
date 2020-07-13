package com.example.controllers;

import com.example.services.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/sentence")
    public String getSentence() {
        return "<h3>Sentence:</h3><br><br>" +
                sentenceService.constructSentence();
    }
}
