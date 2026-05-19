package introduction.polymorphism.instance_of_example;

public class NaimisCollege extends College {
    private String course;

    public NaimisCollege(String id, String name, String address, String course) {
        super(id, name, address);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
