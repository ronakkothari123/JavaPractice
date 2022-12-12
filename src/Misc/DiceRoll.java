package Misc;

import java.util.Arrays;
import java.util.Random;

public class DiceRoll {

    public static final int ROLLS = 100;

    public static void main(String[] args) {
        int[] rollsResults = new int[6];
        Random random = new Random();

        for(int i = 0; i < ROLLS; i++) rollsResults[random.nextInt(6)]++;

        System.out.println(Arrays.toString(rollsResults));
    }
}
