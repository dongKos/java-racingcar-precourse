package racingcar.model;

public class CarName {
    private String value;
    public CarName(String value) {
        if(value.length() < 1 || value.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 1자이상 5자이하이어야합니다.");
        }
        this.value = value;
    }
}
