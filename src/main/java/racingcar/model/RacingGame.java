package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();

    public RacingGame() {

    }

    public void createCars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveCars() {
        for(Car car: cars) {
            car.move(getRandomMoveNumber());
        }
    }

    protected RandomMoveNumber getRandomMoveNumber() {
        return new RandomMoveNumber(Randoms.pickNumberInRange(1, 9));
    }

    public String getMoveResult() {
        StringBuilder moveResult = new StringBuilder();
        for(Car car: cars) {
            moveResult.append(car.getMoveResult()).append("\n");
        }
        return moveResult.toString();
    }
}
