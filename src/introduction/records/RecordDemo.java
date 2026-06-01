package introduction.records;

public class RecordDemo {
    static void main() {
        Person p = new Person("Naim", "Sulejmani");
        System.out.println(p.name());
        System.out.println(p.surname());
        System.out.println(p.toString());
    }
}
