package org.chimera.math;

public class Translation2d {
    double x;
    double y;
    public Translation2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Translation2d [x=" + x + ", y=" + y + "]";
    }
}
