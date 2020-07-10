package com.example.controllers;

import com.example.services.SentenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {

    private final SentenceService sentenceService;

    public SentenceController(SentenceService sentenceService) {
        this.sentenceService = sentenceService;
    }

    @GetMapping("/sentence")
    public String getSentence() {
        return "<h3>Sentence from lab-7</h3><br/>" +
                sentenceService.constructSentence() + "<br/><br/>" +
                sentenceService.constructSentence() + "<br/><br/>" +
                sentenceService.constructSentence() + "<br/><br/>" +
                sentenceService.constructSentence() + "<br/><br/>" +
                sentenceService.constructSentence();
    }
}
