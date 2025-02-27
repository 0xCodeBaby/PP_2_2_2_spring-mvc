package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping( "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int size, Model model) {
        model.addAttribute("cars", carService.getCars(size));
        return "cars";
    }
}
