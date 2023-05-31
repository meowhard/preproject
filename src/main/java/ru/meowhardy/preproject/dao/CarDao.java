package ru.meowhardy.preproject.dao;

import ru.meowhardy.preproject.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> listCars(Car car);
}
