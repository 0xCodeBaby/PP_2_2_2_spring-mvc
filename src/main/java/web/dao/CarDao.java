package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private final List<Car> cars = List.of(
            new Car("model1", "Pink", 1),
            new Car("model2", "Purple", 2),
            new Car("model3", "Yellow", 3),
            new Car("model4", "Green", 4),
            new Car("model5", "Whityee", 5));

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }

}
