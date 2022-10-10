package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();
    private final MovingStrategy movingStrategy;
    public RacingGame(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void createCars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveCars() {
        for(Car car: cars) {
            car.move(movingStrategy);
        }
    }

    public String getMoveResult() {
        StringBuilder moveResult = new StringBuilder();
        for(Car car: cars) {
            moveResult.append(car.getMoveResult()).append("\n");
        }
        return moveResult.toString();
    }
}
