package com.example.services;

import com.example.models.Word;
import com.example.services.proxy.*;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private SubjectService subjectService;
    @Autowired
    private VerbService verbService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private AdjectiveService adjectiveService;
    @Autowired
    private NounService nounService;

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultSubject")
    public Word getSubject() {
        return subjectService.getWord();
    }

    @Override
    public Word getVerb() {
        return verbService.getWord();
    }

    @Override
    public Word getArticle() {
        return articleService.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultAdjective")
    public Word getAdjective() {
        return adjectiveService.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultNoun")
    public Word getNoun() {
        return nounService.getWord();
    }

    private Word getDefaultSubject() {
        return new Word("Somebody");
    }

    private Word getDefaultAdjective() {
        return new Word("_");
    }

    private Word getDefaultNoun() {
        return new Word("something");
    }
}
