package com.example.currencyexchangemicroservices;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CurrencyExchangeService {

    private final Environment environment;

    public ExchangeValue retrieveExchangeValue(String initialCurrency, String finalCurrency){

        Double conversionMultiple = null;

        if (initialCurrency != null && finalCurrency != null){
            if (initialCurrency.equalsIgnoreCase("USD") && finalCurrency.equalsIgnoreCase("INR")){
                conversionMultiple = 78.0;
            } else if (initialCurrency.equalsIgnoreCase("INR") && finalCurrency.equalsIgnoreCase("USD")) {
                conversionMultiple = 0.013;
            }else if (initialCurrency.equalsIgnoreCase("EUR") && finalCurrency.equalsIgnoreCase("INR")) {
                conversionMultiple = 82.0;
            }else if (initialCurrency.equalsIgnoreCase("AUD") && finalCurrency.equalsIgnoreCase("INR")) {
                conversionMultiple = 54.0;
            }else
                System.out.println("Invalid Input");
        }

        ExchangeValue exchangeValue = ExchangeValue.builder()
                .id(1000L)
                .fromCurrency(initialCurrency)
                .toCurrency(finalCurrency)
                .conversionMultiple(conversionMultiple)
                .port(Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"),"String parameter must not be null")))
                .build();

        return  exchangeValue;
    }
}
