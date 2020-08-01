package com.rsjava.builderexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;
    private String color;
    private double price;
    private BigDecimal power;
}
