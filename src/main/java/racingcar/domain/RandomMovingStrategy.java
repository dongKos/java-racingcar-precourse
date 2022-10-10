package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovingStrategy implements MovingStrategy{
    @Override
    public boolean movable() {
        return getRandomMoveNumber().okToGo();
    }

    protected RandomMoveNumber getRandomMoveNumber() {
        return new RandomMoveNumber(Randoms.pickNumberInRange(1, 9));
    }
}
