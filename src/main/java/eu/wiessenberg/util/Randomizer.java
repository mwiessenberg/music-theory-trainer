package eu.wiessenberg.util;

import java.util.Random;

public class Randomizer {
    public static boolean getRandomBoolean() {
        return (new Random().nextInt() % 2) == 0;
    }

}
