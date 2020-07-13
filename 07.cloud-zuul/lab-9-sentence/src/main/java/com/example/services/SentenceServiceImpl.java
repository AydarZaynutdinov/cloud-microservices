package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    private WordService wordService;

    @Override
    public String constructSentence() {
        return wordService.getSubject().getValue() + " " +
                wordService.getVerb().getValue() + " " +
                wordService.getArticle().getValue() + " " +
                wordService.getAdjective().getValue() + " " +
                wordService.getNoun().getValue() + ".";
    }
}
