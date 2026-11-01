package com.project.employee.controller;

import com.project.employee.model.Car;
import com.project.employee.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getCarList() {
        return carService.getCarList();
    }

    @GetMapping("/cars/{id}")
    public Car getCarById(@PathVariable Integer id) {
        return carService.getCarById(id);
    }

    @PostMapping("/car")
    public Car saveCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable Integer id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);
        return ResponseEntity.ok("Car with id " + id + " deleted successfully");
    }
}
