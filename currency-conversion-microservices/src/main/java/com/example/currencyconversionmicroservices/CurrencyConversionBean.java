package com.example.currencyconversionmicroservices;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CurrencyConversionBean {
    private Long id;
    private String from;
    private String to;
    private Integer conversionMultiple;
    private Integer quantity;
    private Integer totalCalculatedAmount;
    private Integer port;
}
