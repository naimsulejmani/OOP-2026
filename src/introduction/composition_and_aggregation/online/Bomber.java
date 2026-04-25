package introduction.composition_and_aggregation.online;

import introduction.ushtrime_class_enums.Point;

public class Bomber {
    private Point position = new Point();
    private int health = 100;
    private AntiAircraftGun target;

    public Bomber(Point position, int health) {
        setPosition(position);
        setHealth(health);
    }

    public Bomber() {
        this(new Point(), 100);
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        if (position == null) {
            System.out.println("Position cannot be null");
            return;
        }
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public AntiAircraftGun getTarget() {
        return target;
    }

    public void setTarget(AntiAircraftGun target) {
        this.target = target;
    }


    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Health cannot be negative");
            this.health = 0;
            return;
        }
        this.health = health;
    }

    public boolean isInRadar() {
        return target != null && target.getPosition().distanceTo(position) < 5;
    }

    public void move(int x, int y) {
        position.setX(position.getX() + x);
        position.setY(position.getY() + y);
    }

    public void attack() {
        if (isInRadar()) {
            if (Math.random() < 0.5) { //simulim kur i shmanget sistemi antiraketor
                target.setHealth(target.getHealth() - (int) (Math.random() * 101));
            }
        }
    }

    @Override
    public String toString() {
        return "Bomber{" +
                "position=" + position +
                ", health=" + health +
                '}';
    }
}
