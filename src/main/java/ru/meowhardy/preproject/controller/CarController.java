package ru.meowhardy.preproject.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.meowhardy.preproject.model.SortException;
import ru.meowhardy.preproject.service.CarServiceImpl;

import java.util.Objects;

@RequestMapping("/cars")
@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @Autowired
    private Environment env;

    @GetMapping()
    public String cars(@RequestParam(name = "count", required = false, defaultValue = "0") Integer count,
                       @RequestParam(name = "sortBy", required = false, defaultValue = "id")  String sortBy,
                       Model model) {
        String sort = env.getProperty(sortBy);
        System.out.println(sort);

        if (Objects.equals(sort, "false")) {
            throw new SortException();
        }

        model.addAttribute("cars", carService.findCars(count, sortBy));
        return "cars";
    }
}
