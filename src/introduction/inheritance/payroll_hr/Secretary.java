package introduction.inheritance.payroll_hr;

import java.time.LocalDate;

public class Secretary extends HourlyEmployee {
    private String department;

    public Secretary(int id, String name, String surname, LocalDate dateOfBirth, LocalDate hireDate, double hours, double hourlyWage, String department) {
        super(id, name, surname, dateOfBirth, hireDate, hours, hourlyWage);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Secretary{" + super.toString() + ", department=" + department + "}";
    }
}
