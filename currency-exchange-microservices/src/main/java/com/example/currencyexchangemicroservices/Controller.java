package com.example.currencyexchangemicroservices;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/currency-exchange/")
public class Controller {
    private final CurrencyExchangeService currencyExchangeService;

    @GetMapping("fromCurrency/{fromCurrency}/toCurrency/{toCurrency}")
    public ResponseEntity<ExchangeValue> exchangeValue (@PathVariable(name = "fromCurrency") String fromCurrency,
                                                        @PathVariable(name = "toCurrency") String toCurrency){
        ExchangeValue exchangeValue = currencyExchangeService.retrieveExchangeValue(fromCurrency, toCurrency);
        return new ResponseEntity<>(exchangeValue, HttpStatus.OK);

    }
}
