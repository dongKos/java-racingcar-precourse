package racingcar.domain;

public class CarName {
    private String value;

    public CarName(String value) {
        validateName(value);
        this.value = value;
    }

    public String getCarName() {
        return this.value;
    }

    private void validateName(String value) {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 이름은 공백일 수 없습니다");
        }

        if (value.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차의 이름은 1자이상 5자이하이어야합니다.");
        }
    }
}
