package com.car.parking_system.dao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long Car_id;
    private String User_name;
    private String Slot_status;
}      //pojo