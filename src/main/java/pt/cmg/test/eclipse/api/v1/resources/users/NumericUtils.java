package pt.cmg.test.eclipse.api.v1.resources.users;

import java.security.SecureRandom;

public class NumericUtils {

    public enum Type {
        REAL,
        IMAGINARY;

    }

    private static int numberThree = 3;
    private static int numberFour = 4;

    private Type numberType = Type.IMAGINARY;

    /**
     * Generates a random number between two values. The lower limit value is inclusive and
     * the upper limit is exclusive.
     *
     * @param lowerLimit
     * @param upperLimit
     * @return
     */
    public static int generateRandomNumber(int lowerLimit, int upperLimit) {
        SecureRandom random = new SecureRandom();

        int min = lowerLimit;
        int max = upperLimit;

        if (upperLimit < lowerLimit) {
            min = upperLimit;
            max = lowerLimit;
        }

        return random.nextInt(max - min) + min;
    }

    public static int generateNumberThree() {
        return numberThree;
    }

    public Type getType() {
        return numberType;
    }

}
