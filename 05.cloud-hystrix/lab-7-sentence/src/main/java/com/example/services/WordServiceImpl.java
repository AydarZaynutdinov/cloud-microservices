package com.example.services;

import com.example.proxyService.*;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService{

    private final SubjectService subjectService;
    private final VerbService verbService;
    private final ArticleService articleService;
    private final AdjectiveService adjectiveService;
    private final NounService nounService;

    public WordServiceImpl(
            SubjectService subjectService,
            VerbService verbService,
            ArticleService articleService,
            AdjectiveService adjectiveService,
            NounService nounService
    ) {
        this.subjectService = subjectService;
        this.verbService = verbService;
        this.articleService = articleService;
        this.adjectiveService = adjectiveService;
        this.nounService = nounService;
    }


    @Override
    @HystrixCommand(fallbackMethod = "subjectFallback")
    public String getSubject() {
        return subjectService.getWord().getValue();
    }

    @Override
    public String getVerb() {
        return verbService.getWord().getValue();
    }

    @Override
    public String getArticle() {
        return articleService.getWord().getValue();
    }

    @Override
    @HystrixCommand(fallbackMethod = "adjectiveFallback")
    public String getAdjective() {
        return adjectiveService.getWord().getValue();
    }

    @Override
    @HystrixCommand(fallbackMethod = "nounFallback")
    public String getNoun() {
        return nounService.getWord().getValue();
    }

    private String adjectiveFallback() {
        return "_";
    }

    private String subjectFallback() {
        return "Someone";
    }

    private String nounFallback() {
        return "something";
    }
}
