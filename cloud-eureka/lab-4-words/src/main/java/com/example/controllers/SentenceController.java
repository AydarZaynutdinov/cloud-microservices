package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${words}")
    private String words;

    @GetMapping("/")
    public @ResponseBody
    String getWords() {
        String[] wordsArray = words.split(",");
        int i = (int) Math.round(Math.random() * (wordsArray.length - 1));
        return wordsArray[i];
    }

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return getWords("LAB-4-SUBJECT") + " "
                + getWords("Lab-4-VERB") + " "
                + getWords("Lab-4-ARTICLE") + " "
                + getWords("Lab-4-ADJECTIVE") + " "
                + getWords("Lab-4-NOUN") + ".";
    }

    public String getWords(String serviceName) {
        List<ServiceInstance> services = discoveryClient.getInstances(serviceName);
        if (services != null && services.size() > 0) {
            URI uri = services.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }
}
