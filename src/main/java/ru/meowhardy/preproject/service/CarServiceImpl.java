package ru.meowhardy.preproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.meowhardy.preproject.dao.CarDao;
import ru.meowhardy.preproject.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Transactional(readOnly = true)
    @Override
    public List<Car> listCars(Car car) {
        return carDao.listCars(car);
    }
}
