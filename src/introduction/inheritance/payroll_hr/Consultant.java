package introduction.inheritance.payroll_hr;

import java.time.LocalDate;

public class Consultant extends HourlyEmployee {

    private String project;

    public Consultant(int id, String name, String surname, LocalDate dateOfBirth, LocalDate hireDate, double hours, double hourlyWage, String project) {
        super(id, name, surname, dateOfBirth, hireDate, hours, hourlyWage);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Consultant{" + super.toString() + ", project=" + project + "}";
    }
}
