package com.example.currencyconversionmicroservices;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CurrencyConversionService {
    private final RestTemplate restTemplate;
    Double totalCalculatedAmount;

    public CurrencyConversionBean convertCurrency(String fromCurrency, String toCurrency, Integer quantity){

        Map<String, String> uriVariables = new HashMap<>();

        uriVariables.put("fromCurrency",fromCurrency);
        uriVariables.put("toCurrency", toCurrency);

        CurrencyConversionBean response = restTemplate.getForObject("http://localhost:8080/api/v1/currency-exchange/fromCurrency/{fromCurrency}/toCurrency/{toCurrency}",
                CurrencyConversionBean.class, uriVariables);

        totalCalculatedAmount = quantity * Objects.requireNonNull(response,"conversion multiple is required").getConversionMultiple();
        return new CurrencyConversionBean(response.getId(),fromCurrency,toCurrency,response.getConversionMultiple(), quantity,totalCalculatedAmount,response.getPort());
    }
}

