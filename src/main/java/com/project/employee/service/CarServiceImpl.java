package com.project.employee.service;

import com.project.employee.model.Car;
import com.project.employee.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getCarList() {
        return carRepository.findAll();
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car getCarById(Integer id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));
    }

    @Override
    public Car updateCar(Integer id, Car updatedCar) {
        Car existing = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));
        existing.setBrand(updatedCar.getBrand());
        existing.setModel(updatedCar.getModel());
        existing.setYear(updatedCar.getYear());
        existing.setPrice(updatedCar.getPrice());
        return carRepository.save(existing);
    }

    @Override
    public void deleteCar(Integer id) {
        if (!carRepository.existsById(id)) {
            throw new RuntimeException("Car not found with id: " + id);
        }
        carRepository.deleteById(id);
    }
}
