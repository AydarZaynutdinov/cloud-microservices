package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    private final WordService wordService;

    public SentenceServiceImpl(WordService wordService) {
        this.wordService = wordService;
    }

    @Override
    public String constructSentence() {
        return String.format(
                "%s %s %s %s %s.",
                wordService.getSubject(),
                wordService.getVerb(),
                wordService.getArticle(),
                wordService.getAdjective(),
                wordService.getNoun()
        );
    }
}
