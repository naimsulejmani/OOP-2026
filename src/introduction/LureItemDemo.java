package introduction;

public class LureItemDemo {
    static void main() {
        LureItem incense = new LureItem();
        incense.name = "Incense";
        incense.duration = 30;

        incense.print();

        LureItem lure = new LureItem();
        lure.name = "Lure";
        lure.duration = 60;

        lure.print();

        if (lure.duration > incense.duration) {
            IO.println("Lure ka me shume duration");
        } else if (lure.duration < incense.duration) {
            IO.println("Lure ka me pak duration");
        } else {
            IO.println("Jane te barabarta");
        }
    }
}
