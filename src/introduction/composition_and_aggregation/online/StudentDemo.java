package introduction.composition_and_aggregation.online;

import java.time.LocalDate;

public class StudentDemo {
    static void main() {
        Student s1 = new Student("Erlent", "Mazreku", LocalDate.of(2005, 12, 1));
        Student s2 = new Student("Enes", "Bytyqi", LocalDate.of(2005, 10, 20));
        Student s3 = new Student("Arbnor", "Basha", LocalDate.of(2005, 11, 15));


        Course c1 = new Course("OOP","Object Oriented programming",LocalDate.of(2024, 9, 1), LocalDate.of(2026, 6, 30));
        Course c2 = new Course("DSA","Data Structures and Algorithms",LocalDate.of(2024, 9, 1), LocalDate.of(2025, 6, 30));


        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c1.enrollStudent(s3);

        c1.removeStudent(s1);
        c1.removeStudent(3);

        c1.printCourse();

        System.out.println("\n\n==========================================\n\n");

        c2.enrollStudent(s1);
        c2.enrollStudent(s2);
        c2.printCourse();


    }
}
