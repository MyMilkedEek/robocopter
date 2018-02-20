package net.mymilkedeek.robocopter;

import robocode.Robot;

/**
 * @author MyMilkedEek <Michael>
 */
public class Robocopter extends Robot {

    @Override
    public void run() {
        while (true) {
            ahead(1.0d);
        }
    }
}