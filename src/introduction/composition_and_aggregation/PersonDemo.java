package introduction.composition_and_aggregation;

import java.time.LocalDate;

public class PersonDemo {
    static void main() {
        Person p = new Person(null,null, LocalDate.of(1999,10,20));
        p.setBrain(null);
        System.out.println(p.toString());
    }
}
