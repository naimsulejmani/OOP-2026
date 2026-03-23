package introduction.summary.exercise;

public class PersonDemo {
    static void main() {
        Person person1 = new Person("John", 25, "M");
        Person person2 = new Person("Jane", 17, "F");
        Person person3 = new Person("Bob", -5, "M");
        Person person4 = new Person("Alice", 30, "X");
        Person person5 = new Person();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());
    }
}
