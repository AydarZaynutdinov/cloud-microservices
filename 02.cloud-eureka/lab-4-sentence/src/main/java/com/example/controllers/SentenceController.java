package com.example.controllers;

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

    private final DiscoveryClient discoveryClient;

    public SentenceController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return getWords("SUBJECT") + " "
                + getWords("VERB") + " "
                + getWords("ARTICLE") + " "
                + getWords("ADJECTIVE") + " "
                + getWords("NOUN") + ".";
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
