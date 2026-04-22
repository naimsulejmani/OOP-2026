package introduction.composition_and_aggregation.online;

import introduction.ushtrime_class_enums.Point;

public class AntiAircraftGun {
    private Point position;
    private int health = 100;


    public AntiAircraftGun(Point position, int health) {
        this.position = position;
        this.health = health;
    }

    public AntiAircraftGun() {

    }
}
