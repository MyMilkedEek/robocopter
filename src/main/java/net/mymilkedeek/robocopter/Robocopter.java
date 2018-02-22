package net.mymilkedeek.robocopter;

import robocode.*;

/**
 * @author MyMilkedEek <Michael>
 */
public class Robocopter extends Robot {

    private boolean enemyScanned = false;
    private double enemyBearing;

    @Override
    public void run() {
        while (true) {
            if (! enemyScanned) {
                super.turnRadarLeft(10d);
            }

            if (this.enemyScanned) {
                super.fire(1.0d);
            }
        }
    }

    @Override
    public void onBulletMissed(BulletMissedEvent event) {
        this.enemyScanned = false;
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

        turnGunRight(getHeading() - getGunHeading() + event.getBearing());
    }
}