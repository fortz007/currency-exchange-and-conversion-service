package com.example.currencyexchangemicroservices;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Exchange_Value")
@Entity
public class ExchangeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "currency_from")
    private String fromCurrency;
    @Column(name = "currency_to")
    private String toCurrency;
    @Column(name = "conversion_multiple")
    private Integer conversionMultiple;
    @Column(name = "port")
    private Integer port;

}
