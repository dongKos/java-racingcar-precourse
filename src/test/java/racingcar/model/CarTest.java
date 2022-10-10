package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차이름을_입력받아_자동차객체를_생성한다() {
        CarName carName = new CarName("a");
        Car car = new Car(carName);
    }

    @Test
    void 자동차이름은_1자이상_5자이하이다() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CarName("");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new CarName("asdasdasd");
        });
    }
}