package ru.meowhardy.preproject.dao;

import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import ru.meowhardy.preproject.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> listCars(Car car) {
        return null;
    }
}
