package ru.meowhardy.preproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.meowhardy.preproject.config.CarConfiguration;
import ru.meowhardy.preproject.exception.SortException;
import ru.meowhardy.preproject.service.CarService;

@RequestMapping("/cars")
@Controller
public class CarController {

    @Autowired
    private CarConfiguration carConfiguration;

    @Autowired
    private CarService carService;

    @GetMapping()
    public String cars(@RequestParam(name = "count", required = false, defaultValue = "0") Integer count,
//                       TODO: defaultValue
                       @RequestParam(name = "sortBy", required = false, defaultValue = "id")  String sortBy,
                       Model model) {

        if (!carConfiguration.getSortEnabled().contains(sortBy)) {
            throw new SortException();
        }

        model.addAttribute("cars", carService.findCars(count, sortBy));
        return "cars";
    }
}
