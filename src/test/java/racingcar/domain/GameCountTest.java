package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameCountTest {

    @Test
    void testCreate() {
        GameCount gameCount = new GameCount("1");
        assertThat(gameCount).isEqualTo(new GameCount("1"));
    }
}