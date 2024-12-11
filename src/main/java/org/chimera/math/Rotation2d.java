package org.chimera.math;

public class Rotation2d {
    double radians;
    public Rotation2d(double radians) {
        this.radians = radians;
    }

    public Rotation2d() {
        this(0);
    }

    public static Rotation2d fromRadians(double radians) {
        return new Rotation2d(radians);
    }

    public static Rotation2d fromDegrees(double degrees) {
        return new Rotation2d(degrees * (Math.PI / 180));
    }

    public double getRadians() {
        return radians;
    }
    public double getDegrees() {
        return radians * (180 / Math.PI);
    }

    @Override
    public String toString() {
        return "Rotation2d: " + radians + " degrees";
    }
}
