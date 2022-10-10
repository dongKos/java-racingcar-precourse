package racingcar.domain;

public class Car {
    private CarName carName;

    private Position position;

    public Car(CarName carName) {
        this.carName = carName;
        this.position = new Position();
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable()) {
            position.move();
        }
    }

    public Position getCurrentPositon() {
        return position;
    }

    public String getMoveResult() {
        String currentPositionString = getCurrentPositionString();
        return this.carName.getCarName() + " : " + currentPositionString;
    }

    private String getCurrentPositionString() {
        return position.getCurrentPositionString();
    }

    public String isWinner(Position maxPosition) {
        if(this.position.equals(maxPosition)) {
            return this.carName.getCarName() + ", ";
        }
        return "";
    }
}
