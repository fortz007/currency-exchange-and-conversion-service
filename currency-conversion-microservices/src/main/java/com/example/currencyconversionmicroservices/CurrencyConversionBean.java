package com.example.currencyconversionmicroservices;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversionBean {
    private Long id;
    private String from;
    private String to;
    private Double conversionMultiple;
    private Integer quantity;
    private Double totalCalculatedAmount;
    private Integer port;
}
