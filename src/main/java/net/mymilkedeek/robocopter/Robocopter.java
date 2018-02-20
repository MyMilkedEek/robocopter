package net.mymilkedeek.robocopter;

import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * @author MyMilkedEek <Michael>
 */
public class Robocopter extends Robot {

    private boolean enemyScanned = false;
    private double enemyBearing;

    @Override
    public void run() {
        while (true) {
            if ( !enemyScanned ) {
                super.turnRadarLeft(10d);
            }

            if ( this.enemyScanned ) {
                super.fire(1.0d);
            }
        }

    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        out.println("enemy scanned");
        enemyScanned = true;

        double radarHeading = super.getRadarHeading();
        double gunHeading = super.getGunHeading();

        out.println(radarHeading);
        out.println(gunHeading);
        out.println(event.getBearing());

        double b = gunHeading - radarHeading;

        if ( b > 0 ) {
            turnGunRight(b);
        } else {
            turnGunLeft(b);
        }
    }
}