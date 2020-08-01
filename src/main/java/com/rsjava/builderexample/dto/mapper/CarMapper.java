package com.rsjava.builderexample.dto.mapper;

import com.rsjava.builderexample.dto.CarDto;
import com.rsjava.builderexample.model.Car;
import org.springframework.stereotype.Service;

@Service
public class CarMapper {

    public CarDto mapToDTo(Car car){
        return CarDto.builder()
                .brand(car.getBrand())
                .model(car.getModel())
                .power(car.getPower())
                .build();
    }
}
