package ru.meowhardy.preproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.meowhardy.preproject.dao.CarDao;
import ru.meowhardy.preproject.model.Car;

import java.util.List;

@Service
public class CarServiceImpl{

    @Autowired
    private CarDao carDao;

    /**
     * Возвращает список автомобилей из базы согласно параметрам HTTP запроса
     * @param count количество автомобилей
     * @param sortBy способ сортировки
     * @return список автомобилей
     */
    public List<Car> findCars(Integer count, String sortBy) {
        if (count == 0) {
            count = Integer.MAX_VALUE;
        }
        return carDao.findAll(PageRequest.of(0, count, Sort.by(Sort.Direction.ASC, sortBy))).getContent();
    }
}