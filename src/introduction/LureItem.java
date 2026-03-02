package introduction;

public class LureItem {
    public String name;
    public int duration;


    public void print() {
        System.out.printf("Item: %s has duration %d seconds!%n", name, duration);
    }
}
