package org.chimera.math;

public class Pose2d {
    double x;
    double y;
    Rotation2d rotation;
    public Pose2d(double x, double y, double radians) {
        this.x = x;
        this.y = y;
        this.rotation = new Rotation2d(radians);
    }

    public Pose2d(double x, double y, Rotation2d rotation) {
        this.x = x;
        this.y = y;
        this.rotation = rotation;
    }

    public Pose2d(Translation2d translation, Rotation2d rotation) {
        this.x = translation.x;
        this.y = translation.y;
        this.rotation = rotation;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public Rotation2d getRotation() {
        return rotation;
    }
    public Translation2d getTranslation() {
        return new Translation2d(x, y);
    }

    @Override
    public String toString() {
        return "Pose2d [x=" + x + ", y=" + y + ", " + rotation + "]";
    }
}
