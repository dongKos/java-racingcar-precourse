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

    public String getMoveResult() {
        String currentPositionString = getCurrentPositionString();
        return this.carName.getCarName() + " : " + currentPositionString;
    }

    private String getCurrentPositionString() {
        StringBuilder currentPositionString = new StringBuilder();
        for(int i = 0; i < currentPosition; i++) {
            currentPositionString.append("-");
        }
        return currentPositionString.toString();
    }
}
