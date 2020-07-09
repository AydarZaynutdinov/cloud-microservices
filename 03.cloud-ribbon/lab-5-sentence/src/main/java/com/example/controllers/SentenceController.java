package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {

    private final RestTemplate restTemplate;

    public SentenceController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/sentence")
    public @ResponseBody String getSentence() {
        return getWords("SUBJECT") + " "
                + getWords("VERB") + " "
                + getWords("ARTICLE") + " "
                + getWords("ADJECTIVE") + " "
                + getWords("NOUN") + ".";
    }

    public String getWords(String serviceName) {
        return restTemplate.getForObject("http://" + serviceName, String.class);
    }
}
