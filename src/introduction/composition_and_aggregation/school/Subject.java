package introduction.composition_and_aggregation.school;

public class Subject {
    private static long nextId = 1L;
    private final long id;
    private String name;
    private int credits;
    private Teacher teacher;

    public Subject(String name, int credits, Teacher teacher) {
        this.id = nextId++;
        this.name = name;
        this.credits = credits;
        this.teacher = teacher;
    }

    public Subject() {
        this(null, 0, null);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

