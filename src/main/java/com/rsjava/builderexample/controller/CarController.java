package com.rsjava.builderexample.controller;

import com.rsjava.builderexample.dto.CarDto;
import com.rsjava.builderexample.dto.mapper.CarMapper;
import com.rsjava.builderexample.model.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarMapper carMapper;

    @GetMapping("cars")
    public List<CarDto> getCarDtoList() {
        return initCarList().stream()
                .map(car -> carMapper.mapToDTo(car))
                .collect(Collectors.toList());
    }

    private List<Car> initCarList() {
        return new ArrayList<>(Arrays.asList(
                new Car("BMW", "F10", "BLACK", 120000D, BigDecimal.valueOf(210)),
                new Car("DODGE", "CHALLENGER", "GREY", 75000D, BigDecimal.valueOf(350))
        ));
    }
}
