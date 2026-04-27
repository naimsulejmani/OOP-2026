package introduction.composition_and_aggregation.school;

/*
CREATE TABLE Students (
ID BIGINT NOT NULL IDENTITY(1,1) PRIMARY KEY,
Name VARCHAR(255) NOT NULL,
LastName VARCHAR(255) NOT NULL,
Age INT NOT NULL
)
 */
public class Student {
    private static long nextId = 1L;
    private final long id;
    private String name;
    private String lastName;
    private int age;

    public Student() {
       this(null,null,0);
    }

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}
