package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarService();

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(defaultValue = "5") int count, Model model) {

        model.addAttribute("carList", carService.getCar(count));

        return "cars";
    }
}
