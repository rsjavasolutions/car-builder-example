package com.rsjava.builderexample.dto;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Builder
public class CarDto {
    private String brand;
    private  String model;
    private BigDecimal power;
}
