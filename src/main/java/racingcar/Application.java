package racingcar;

import racingcar.controller.GameController;
import racingcar.view.GameView;

public class Application {
    public static void main(String[] args) {
        new GameController(new GameView()).start();
    }
}
