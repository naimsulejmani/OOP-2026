package introduction.inheritance;

public class PersonDemo {
    static void main() {
        Student student = new Student();
        student.setId(1);
        student.setAddress("Tirana");
        student.setEmail("a@a.com");
        student.setPhoneNumber("123456789");
        student.setName("Erlent");
        System.out.println(student.toString());
    }
}
