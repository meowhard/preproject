package ru.meowhardy.preproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsController {

    @SuppressWarnings("SpringMVCViewInspection")
    @GetMapping("/cars")
    public String cars() {
        return "cars";
    }
}
