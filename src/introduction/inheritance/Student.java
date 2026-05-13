package introduction.inheritance;

public class Student extends Person {

//    private String email;

    public Student() {
        super(0, null, null, null, null);

        this.email="b@b.b";
        super.email="c@c.c";
        this.setId(1);
        super.setId(1);
    }

    @Override
    public String toString() {
        return "Student -> "+super.toString();
    }

}
