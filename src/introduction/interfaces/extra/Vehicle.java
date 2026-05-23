package introduction.interfaces.extra;

public class Vehicle implements Comparable<Vehicle> {
    private int speed;
    private int price;

    public Vehicle(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.speed - o.speed;
    }
}
