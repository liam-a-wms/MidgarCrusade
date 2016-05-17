package fr.toss.common.player.spells.archer;

import java.util.Random;

public class RandomBoolean {
    Random random = new Random();
    public boolean getBoolean() {
        return random.nextBoolean();
    }
    public static void main(String[] args) {
        RandomBoolean randomBoolean = new RandomBoolean();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomBoolean.getBoolean());
        }
    }
}