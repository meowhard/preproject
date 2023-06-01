package ru.meowhardy.preproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.meowhardy.preproject.model.Car;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> showSomeCars(int count);
}
