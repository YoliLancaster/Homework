package com.ua.robotdreams.homework15;

public class Main {
    public static void main(String[] args) {

        Flyable p1 = new Pilot();
        Drivable d1 = new Driver();


        p1.canDo();
        flyObject(p1);

        d1.canDo();
        driveObject(d1);

    }

    private static void flyObject(Flyable flyable) {
        flyable.takeOff();
        flyable.flying();
        flyable.landing();
    }

    private static void driveObject(Drivable drivable) {
        drivable.startMoving();
        drivable.moving();
        drivable.stopMoving();
    }
}