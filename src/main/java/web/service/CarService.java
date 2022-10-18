package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    public List<Car> getCar(List<Car> listCar, int kol) {

        if (kol >= 5 || kol == 0) {
            return listCar;
        } else {
            return listCar.stream().limit(kol).toList();
        }
    }
}
