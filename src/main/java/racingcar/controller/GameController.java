package racingcar.controller;

import racingcar.model.RacingGame;
import racingcar.util.CarUtil;
import racingcar.view.GameView;

public class GameController {

    private GameView gameView;
    public GameController(GameView gameView) {
        this.gameView = gameView;
    }

    public void start() {
        RacingGame racingGame = new RacingGame();

        gameView.printCarNameScript();
        String carNamesString = gameView.getInput();

        racingGame.createCars(CarUtil.createCarsOf(carNamesString));

        gameView.printTryCountScript();
        int maxTryCount = Integer.parseInt(gameView.getInput());

        for(int tryCount = 0; tryCount < maxTryCount; tryCount++) {
            racingGame.moveCars();
            gameView.print(racingGame.getMoveResult());
        }

    }
}
