package introduction.summary;

public class Counter {
    private static int MAX = 100;
    private int value = 0;

    public void increment() {

        ++this.value;
    }

    public int getValue() {
        return value;
    }
}
