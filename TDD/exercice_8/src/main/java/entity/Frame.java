package entity;

import lombok.Getter;

public class Frame {

    @Getter
    private int score;
    private ShootGenerator shootGenerator;
    private int round;
    private int keel;
    private int count;


    public Frame(ShootGenerator shootGenerator, int round) {
        this.score = 0;
        this.shootGenerator = shootGenerator;
        this.round = round;
        this.keel = 10;
        this.count = 0;
    }

    public void makeShoot() {
        if (round == 10) {
            lastRound();
        }
        if (keel == 0) {
            throw new StopException();
        }
        if (count == 2) {
            throw new StopException();
        }
        int shoot = shootGenerator.getRandomShoot(keel);
        score += shoot;
        keel -= shoot;
        count++;
    }

    public boolean stopRound() {
        return true;
    }

    public void lastRound() {
        if (count == 2 && ) {
            throw new StopException();
        }
        if (keel == 0) {
            keel = 10;
        }
        int shoot = shootGenerator.getRandomShoot(keel);
        score += shoot;
        keel -= shoot;
        count++;
        if (keel == 0) {
            keel = 10;
        }



    }

}
