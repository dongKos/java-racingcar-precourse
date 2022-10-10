package racingcar.model;

public class Car {
    private CarName carName;
    private int currentPosition;
    public Car(CarName carName) {
        this.carName = carName;
    }

    public void move(RandomMoveNumber randomMoveNumber) {
        if(randomMoveNumber.okToGo()) {
            currentPosition++;
        }
    }

    public int getCurrentPositon() {
        return this.currentPosition;
    }
}
