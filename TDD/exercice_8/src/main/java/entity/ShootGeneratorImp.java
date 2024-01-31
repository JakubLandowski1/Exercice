package entity;

import java.util.Random;

public class ShootGeneratorImp implements ShootGenerator{

    @Override
    public int getRandomShoot(int keel) {
        Random rand = new Random();
        return rand.nextInt(keel + 1 );
    }
}
