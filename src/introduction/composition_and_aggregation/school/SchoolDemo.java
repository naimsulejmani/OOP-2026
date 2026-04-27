package introduction.composition_and_aggregation.school;

public class SchoolDemo {
    static void main() {
        Teacher teacher = new Teacher("Naim", "Sulejmani", 30);
        Subject subject = new Subject("OOP", 3, teacher);
        Student student = new Student("Erlent", "Mazreku", 18);
        Grade grade = new Grade(4, student, subject);
        grade.print();
    }
}
