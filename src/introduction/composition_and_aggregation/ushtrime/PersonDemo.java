package introduction.composition_and_aggregation.ushtrime;

import java.time.LocalDate;
import java.util.ArrayList;

public class PersonDemo {
    static void main() {
        //simulim i nje fajlli tekstual (CSV)
        String text = """
                Naim Sulejmani,1986,12,16
                Filan Fisteku,2000,5,20
                Blerina Bregu,1995,11,15
                """;

        String[] lines = text.split("\n");
        ArrayList<Person> people = new ArrayList<>();


        for (String line : lines) {
            if (line.trim().isBlank()) {
                continue;
            }
            String[] tokens = line.trim().split(",");
            String name = tokens[0].trim();
            int year = Integer.parseInt(tokens[1].trim());
            int month = Integer.parseInt(tokens[2].trim());
            int day = Integer.parseInt(tokens[3].trim());
            Person p = new Person(name, LocalDate.of(year, month, day));
            people.add(p);
            System.out.println(p);
        }
        System.out.println("Total peoples: " + people.size());
    }
}
