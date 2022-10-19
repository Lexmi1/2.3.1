package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {

    private CarServiceImp carServiceImp = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(defaultValue = "5") int count, Model model) {

        model.addAttribute("carList", carServiceImp.getCar(count));

        return "cars";
    }
}
