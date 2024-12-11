// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
// Bindings of the PathFlow Project by Krishna Shah (@DragonflyRobotics) https://github.com/DragonflyRobotics/PathFlow
package org.chimera.pathflow;


import org.chimera.math.MathUtil;
import org.chimera.math.Pose2d;
import org.chimera.math.Rotation2d;

import java.lang.Math;

import static org.chimera.math.MathUtil.nCr;

public class Bezier {
    /**
     * Creates a new Bezier.
     */
    public Bezier() {
    }


    public static BezierFunction computeBezier(Pose2d[] points) {
        int n = points.length - 1;
        return t -> {
            Pose2d pose = new Pose2d(0.0, 0.0, new Rotation2d());
            if (t <= 0.0) {
                return points[0];
            } else if (t >= 1.0) {
                return points[points.length - 1];
            } else {
                for (int i = 0; i < points.length; i++) {
                    double pow = Math.pow(1 - t, n - i);
                    double X = nCr(n, i) * pow * Math.pow(t, i) * points[i].getX();
                    double Y = nCr(n, i) * pow * Math.pow(t, i) * points[i].getY();
                    double theta = nCr(n, i) * pow * Math.pow(t, i) * points[i].getRotation().getDegrees();
                    pose = new Pose2d(pose.getX() + X, pose.getY() + Y, Rotation2d.fromDegrees(pose.getRotation().getDegrees() + theta));
                }
                pose = new Pose2d(pose.getTranslation(), Rotation2d.fromRadians(MathUtil.angleModulus(pose.getRotation().getRadians())));
                return pose;
            }
        };
    }

    @FunctionalInterface
    public interface BezierFunction {
        Pose2d apply(double t);
    }
}