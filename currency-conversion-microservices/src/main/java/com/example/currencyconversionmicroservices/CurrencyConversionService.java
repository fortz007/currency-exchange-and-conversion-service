package com.example.currencyconversionmicroservices;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CurrencyConversionService {

    public CurrencyConversionBean convertCurrency(String fromCurrency, String toCurrency, Integer quantity){

       return new CurrencyConversionBean();
    }
}

