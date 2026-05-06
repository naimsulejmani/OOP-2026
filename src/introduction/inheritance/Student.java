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

    public void setId(int id) {
        if(id<0) {
            return;
        }
        super.setId(id);
    }
}
