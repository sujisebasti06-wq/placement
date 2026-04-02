package com.car.parking_system.repository;

import com.car.parking_system.dao.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepo extends JpaRepository<Car,Integer> {
    List<Car> findAll();

   // ScopedValue<Object> findById(int carId);

    Car save(Car existing);

    void deleteById(int carId);
}


