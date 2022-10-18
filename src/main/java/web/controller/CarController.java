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
    public String getCar(@RequestParam(value = "count", required = false) Integer count, Model model) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 1, "Germany"));
        carList.add(new Car("Lada", 2, "Russia"));
        carList.add(new Car("Lada", 3, "Russia"));
        carList.add(new Car("Mercedes", 4, "Germany"));
        carList.add(new Car("Ferrari", 5, "France"));
        carList.add(new Car("Bugatti", 6, "France"));
        carList.add(new Car("Volga", 7, "Russia"));
        carList.add(new Car("Volga", 8, "Russia"));

        if (count == null) {
            count = 0;
        }

        List<Car> resultCarList = carService.getCar(carList, count);

        model.addAttribute("resultCarList", resultCarList);

        return "cars";
    }
}
