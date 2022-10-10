package racingcar.domain;

public class GameCount {

    private final int gameCount;
    public GameCount(String gameCount) {
        try {
            this.gameCount = Integer.parseInt(gameCount);
        } catch(Exception exception) {
            throw new IllegalArgumentException("올바른 숫자를 입력하세요.");
        }
    }

    public int getGameCount() {
        return gameCount;
    }
}
