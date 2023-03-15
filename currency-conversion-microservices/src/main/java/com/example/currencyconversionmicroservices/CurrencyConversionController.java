package com.example.currencyconversionmicroservices;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/currency-converter")
@RequiredArgsConstructor
public class CurrencyConversionController {
    private final CurrencyConversionService conversionService;

    @GetMapping("/fromCurrency/{fromCurrency}/toCurrency/{toCurrency}/quantity/{quantity}")
    public ResponseEntity<CurrencyConversionBean> convertCurrency(@PathVariable String fromCurrency,@PathVariable String toCurrency, @PathVariable Integer quantity){
        CurrencyConversionBean currencyConversionBean = conversionService.convertCurrency(fromCurrency, toCurrency, quantity);
        return new ResponseEntity<>(currencyConversionBean, HttpStatus.OK);
    }
}
