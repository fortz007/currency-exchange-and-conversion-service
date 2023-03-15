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
    private Integer conversionMultiple;
    private Integer quantity;
    private Integer totalCalculatedAmount;
    private Integer port;
}
