package com.bulldoginvestimentos.mvp.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RealEstateInvestmentService {
    private final RestTemplate restTemplate;

    public RealEstateInvestmentService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getRealEstateInvestmentList() {
        String url = "https://fiiapi.jonathasacruz.repl.co/listafii";
        return this.restTemplate.getForObject(url, String.class);
    }

}
