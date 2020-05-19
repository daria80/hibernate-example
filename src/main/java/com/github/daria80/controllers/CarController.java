package com.github.daria80.controllers;

import com.github.daria80.models.Car;
import com.github.daria80.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {


    private final CarRepository carRepository;

    public Car createCar(@RequestBody Car car) {
        return  carRepository.save(car);
    }
}
