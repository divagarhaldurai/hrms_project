package com.project.employee.service;

import com.project.employee.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarList();

    Car saveCar(Car car);

    Car getCarById(Integer id);

    Car updateCar(Integer id, Car car);

    void deleteCar(Integer id);
}
