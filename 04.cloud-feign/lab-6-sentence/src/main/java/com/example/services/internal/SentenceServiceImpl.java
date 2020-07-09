package com.example.services.internal;

import com.example.services.external.*;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    private final AdjectiveService adjectiveService;
    private final ArticleService articleService;
    private final NounService nounService;
    private final SubjectService subjectService;
    private final VerbService verbService;

    public SentenceServiceImpl(
            AdjectiveService adjectiveService,
            ArticleService articleService,
            NounService nounService,
            SubjectService subjectService,
            VerbService verbService
    ) {
        this.adjectiveService = adjectiveService;
        this.articleService = articleService;
        this.nounService = nounService;
        this.subjectService = subjectService;
        this.verbService = verbService;
    }


    @Override
    public String constructSentence() {
        return subjectService.getWord().getValue() + " "
                + verbService.getWord().getValue() + " "
                + articleService.getWord().getValue() + " "
                + adjectiveService.getWord().getValue() + " "
                + nounService.getWord().getValue() + ".";
    }
}
