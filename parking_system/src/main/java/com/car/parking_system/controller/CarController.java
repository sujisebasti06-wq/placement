package com.car.parking_system.controller;
import com.car.parking_system.dao.Car;
import com.car.parking_system.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/cars")

public class CarController {
    @Autowired
    private CarService serviceobj;

    @GetMapping
    public List<Car> getAllCars() {

        return serviceobj.getAllCars();
    }

    @PostMapping
    public Car create(@RequestBody Car c) {

        return serviceobj.createCars(c);
    }

    @PutMapping("/{Car_id}")
    public Car update(@RequestBody Car c,@PathVariable int Car_id) {

        return serviceobj.updateCar(c,Car_id);
    }
    @DeleteMapping("/{Car_id}")
    public String delete(@PathVariable int Car_id) {

        return serviceobj.deleteCar(Car_id);
    }
}
//CarController.java
