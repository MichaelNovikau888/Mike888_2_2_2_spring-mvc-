package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("Chevrolet", "Malibu", 2018));
        cars.add(new Car("Nissan", "Altima", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
