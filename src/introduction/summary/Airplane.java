package introduction.summary;

public class Airplane {

    private int capacity;
    private int speed;

    public Airplane(int capacity, int speed) {
        setCapacity(capacity);
        setSpeed(speed);
    }

    public Airplane() {

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity < 0 || capacity > 250){
            System.out.println("Gabim! Nuk ka hapsire!");
            return;
        }
        this.capacity = capacity;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0 || speed > 1000){
            System.out.println("Gabim! Nuk shkon ma shpejt!");
            return;
        }
        this.speed = speed;
    }

    public String toString() {
        return String.format("Capacity: %d, Speed: %d", capacity, speed);
    }


}
