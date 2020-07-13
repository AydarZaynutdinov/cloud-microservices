package com.example.services;

import com.example.models.Word;

public interface WordService {

    Word getSubject();
    Word getVerb();
    Word getArticle();
    Word getAdjective();
    Word getNoun();
}
