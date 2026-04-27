package introduction.composition_and_aggregation.school;

public class Grade {
    private static long nextId = 1L;
    private final long id;
    private int grade = 5;
    private Student student;
    private Subject subject;

    public Grade(int grade, Student student, Subject subject) {
        this.id = nextId++;
       setGrade(grade);
       setStudent(student);
       setSubject(subject);
    }

    public long getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade <5 || grade > 10){
            System.out.println("Invalid grade. Grade must be between 5 and 10.");
            return;
        }
        this.grade = grade;

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        if (student == null) {
            System.out.println("Invalid student. Student cannot be null.");
            return;
        }
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        if (subject == null) {
            System.out.println("Invalid subject. Subject cannot be null.");
            return;
        }
        this.subject = subject;
    }

    public void print() {
        //Student name, lastname then subject name and then grade each in new line
        System.out.println("Student: " + student.getName() + " " + student.getLastName());
        System.out.println("Subject: " + subject.getName());
        System.out.println("Teacher: " + subject.getTeacher().getName() + " " + subject.getTeacher().getLastName());
        System.out.println("Grade: " + grade);
    }
}
