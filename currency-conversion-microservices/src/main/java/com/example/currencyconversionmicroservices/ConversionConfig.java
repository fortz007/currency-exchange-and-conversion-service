package com.example.currencyconversionmicroservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConversionConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
