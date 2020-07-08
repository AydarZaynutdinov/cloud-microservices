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
        return getWords("LAB-4-SUBJECT") + " "
                + getWords("Lab-4-VERB") + " "
                + getWords("Lab-4-ARTICLE") + " "
                + getWords("Lab-4-ADJECTIVE") + " "
                + getWords("Lab-4-NOUN") + ".";
    }

    public String getWords(String serviceName) {
        return restTemplate.getForObject("http://" + serviceName, String.class);
    }
}
