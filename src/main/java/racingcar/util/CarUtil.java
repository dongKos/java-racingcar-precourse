package racingcar.util;

import racingcar.model.Car;
import racingcar.model.CarName;

import java.util.ArrayList;
import java.util.List;

public class CarUtil {

    public static List<Car> createCarsOf(String carNamesString) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNamesString.split(",")) {
            cars.add(new Car(new CarName(carName)));
        }
        return cars;
    }
}
