package ru.meowhardy.preproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.meowhardy.preproject.model.Car;

public interface CarDao extends JpaRepository<Car, Integer>{
}
