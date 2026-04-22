package introduction.composition_and_aggregation.online;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Course {

    private static int nextId = 1;
    public static final int MAX_STUDENTS = 100;
    private final int id;
    private String code;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    //    private Student[] students = new Student[MAX_STUDENTS];
    // generic classes (type safety)
    private ArrayList<Student> students = new ArrayList<>();
//    private int studentCount = 0;

    public Course(String code, String name, LocalDate startDate, LocalDate endDate) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void enrollStudent(Student student) {
        if (students.size() >= MAX_STUDENTS) {
            System.out.println("Course is full!");
            return;
        }
//        students[studentCount++] = student;
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public void printCourse() {
        System.out.printf("Course ID: %d%n", this.id);
        System.out.printf("Course Code: %s%n", this.code);
        System.out.printf("Course Name: %s%n", this.name);
        System.out.printf("Start Date: %s%n", this.startDate);
        System.out.printf("End Date: %s%n", this.endDate);
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            if (student == null) break;
            System.out.printf("- %s %s (ID: %d, Birthdate: %s)%n",
                    student.getName(), student.getSurname(), student.getId(), student.getBirthdate());
        }
        System.out.println("-----------------------------------------");
        System.out.printf("Total Enrolled Students: %d%n", students.size());
        System.out.println("-----------------------------------------");
        System.out.printf("Available Seats: %d%n", MAX_STUDENTS - students.size());
        System.out.println("-----------------------------------------");
        System.out.printf("Is Active: %b%n", this.startDate.isBefore(LocalDate.now()) && this.endDate.isAfter(LocalDate.now()));
        System.out.printf("Printed on %s%n", LocalDateTime.now());
    }
}
