package net.mymilkedeek.robocopter;

import java.awt.geom.Point2D;

/**
 * Data class to contain information about an enemy.
 *
 * @author MyMilkedEek <Michael>
 */
class Enemy {

    private Point2D.Double location;
    private double energy;

    Enemy() {
        this.energy = 100d;
    }

    Point2D.Double getLocation() {
        return this.location;
    }

    Point2D.Double getLocationClone() {
        return (Point2D.Double) this.location.clone();
    }

    Enemy setLocation(Point2D.Double location) {
        this.location = location;
        return this;
    }

    double getEnergy() {
        return this.energy;
    }

    Enemy setEnergy(double energy) {
        this.energy = energy;
        return this;
    }
}