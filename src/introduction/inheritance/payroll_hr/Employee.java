package introduction.inheritance.payroll_hr;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private LocalDate hireDate;

    public Employee(int id, String name, String surname, LocalDate dateOfBirth, LocalDate hireDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getAge() {
        return (int) (LocalDate.now().toEpochDay() - dateOfBirth.toEpochDay()) / 365;
    }

    public int getSeniority() {
        return (int) (LocalDate.now().toEpochDay() - hireDate.toEpochDay()) / 365;
    }

    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth
                + ", hireDate=" + hireDate + "]";
    }
}
