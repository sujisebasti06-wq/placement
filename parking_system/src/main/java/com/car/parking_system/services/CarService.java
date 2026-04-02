package com.car.parking_system.services;
import com.car.parking_system.dao.Car;
import com.car.parking_system.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepo repo;

    // GET all cars
    public List<Car> getAllCars() {
        return repo.findAll();
    }

    // CREATE car
    public Car createCars(Car c) {
        return repo.save(c);
    }

    // DELETE car
    public String deleteCar(int Car_id) {
        repo.deleteById(Car_id);
        return "Car deleted successfully";
    }

    // UPDATE car
    public Car updateCar(Car c, int Car_id) {
        Car existing = (Car) repo.findById(Car_id).orElse(null);

        if (existing != null) {
            existing.setUser_name(c.getUser_name());
            existing.setSlot_status(c.getSlot_status());

            return repo.save(existing);
        } else {
            return null;
        }
    }
} //CarService
