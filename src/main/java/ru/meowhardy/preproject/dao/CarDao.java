package ru.meowhardy.preproject.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.meowhardy.preproject.model.Car;

import java.util.List;

public interface CarDao extends JpaRepository<Car, Integer>{
}
