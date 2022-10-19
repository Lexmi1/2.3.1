package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", 1, "Germany"));
        carList.add(new Car("Lada", 2, "Russia"));
        carList.add(new Car("Lada", 3, "Russia"));
        carList.add(new Car("Mercedes", 4, "Germany"));
        carList.add(new Car("Ferrari", 5, "France"));
        carList.add(new Car("Bugatti", 6, "France"));
        carList.add(new Car("Volga", 7, "Russia"));
        carList.add(new Car("Volga", 8, "Russia"));
    }

    @Override
    public List<Car> getCar(int kol) {
        if (kol >= 5) {
            return carList;
        } else {
            return carList.stream().limit(kol).toList();
        }
    }
}
