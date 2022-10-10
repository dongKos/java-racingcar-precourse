package racingcar.controller;

import racingcar.domain.RacingGame;
import racingcar.domain.RandomMovingStrategy;
import racingcar.util.CarUtil;
import racingcar.view.GameView;

public class GameController {

    private GameView gameView;
    public GameController(GameView gameView) {
        this.gameView = gameView;
    }

    public void start() {
        RacingGame racingGame = new RacingGame(new RandomMovingStrategy());

        gameView.printCarNameScript();
        String carNamesString = gameView.getInput();

        racingGame.createCars(CarUtil.createCarsOf(carNamesString));

        gameView.printTryCountScript();
        int maxTryCount = Integer.parseInt(gameView.getInput());

        for(int tryCount = 0; tryCount < maxTryCount; tryCount++) {
            racingGame.moveCars();
            gameView.print(racingGame.getMoveResult());
        }

        String winnerString = racingGame.getWinnerText();
        gameView.print("최종 우승자" + winnerString);
    }
}
