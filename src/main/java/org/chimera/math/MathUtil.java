package org.chimera.math;

public final class MathUtil {
    /**
     * Returns modulus of input.
     *
     * @param input        Input value to wrap.
     * @param minimumInput The minimum value expected from the input.
     * @param maximumInput The maximum value expected from the input.
     * @return The wrapped value.
     */
    public static double inputModulus(double input, double minimumInput, double maximumInput) {
        double modulus = maximumInput - minimumInput;

        // Wrap input if it's above the maximum input
        int numMax = (int) ((input - minimumInput) / modulus);
        input -= numMax * modulus;

        // Wrap input if it's below the minimum input
        int numMin = (int) ((input - maximumInput) / modulus);
        input -= numMin * modulus;

        return input;
    }

    /**
     * Wraps an angle to the range -π to π radians.
     *
     * @param angleRadians Angle to wrap in radians.
     * @return The wrapped angle.
     */
    public static double angleModulus(double angleRadians) {
        return inputModulus(angleRadians, -Math.PI, Math.PI);
    }

    public static long factorial(long n) throws RuntimeException {
        if (n > 20) {
            throw new RuntimeException("Factorial too large for long...");
        }
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static long nCr(long n, long k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
