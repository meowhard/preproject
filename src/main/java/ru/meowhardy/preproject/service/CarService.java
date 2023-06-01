package ru.meowhardy.preproject.service;

import ru.meowhardy.preproject.model.Car;

import java.util.List;

public interface CarService {

    /**
     * Возвращает необходимое количество автомобилей из базы
     * @param count кол-во автомобилей
     * @return список автомобилей
     */
    List<Car> read(int count);
}
