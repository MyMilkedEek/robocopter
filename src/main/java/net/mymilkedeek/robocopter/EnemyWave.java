package net.mymilkedeek.robocopter;

import java.awt.geom.Point2D;

/**
 * Data class containing information on a wave and its meta-information
 *
 * @author MyMilkedEek <Michael>
 */
public class EnemyWave {

    Point2D.Double fireLocation;
    long fireTime;
    double bulletVelocity, directAngle, distanceTraveled;
    int direction;

    public EnemyWave() {
        // empty body
    }
}
