package introduction.composition_and_aggregation.school;

public class Teacher {
    private static long nextId = 1L;
    private final long id;
    private String name;
    private String lastName;
    private int age;

    public Teacher(String name, String lastName, int age) {
        this.id = nextId++;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Teacher() {
        this(null, null, 0);
    }

    public static long getNextId() {
        return nextId;
    }

    public static void setNextId(long nextId) {
        Teacher.nextId = nextId;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
