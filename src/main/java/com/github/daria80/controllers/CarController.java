package com.github.daria80.controllers;

import com.github.daria80.models.Car;
import com.github.daria80.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {


    private final CarRepository carRepository;

    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car) {
        return  carRepository.save(car);
    }

    @GetMapping("/cars")
    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
