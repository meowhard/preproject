package ru.meowhardy.preproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.meowhardy.preproject.model.Car;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public List<Car> carList(
            @RequestParam(name = ""))
}
