package introduction.inheritance.payroll_hr;

import java.time.LocalDate;

public class Manager extends SalariedEmployee {
    private String department;

    public Manager(int id, String name, String surname, LocalDate dateOfBirth, LocalDate hireDate, double salary, double bonusPercentage, String department) {
        super(id, name, surname, dateOfBirth, hireDate, salary, bonusPercentage);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public double pay() {
        int seniority = getSeniority();
        double payment = super.pay();
        return payment + (seniority > 20 ? 500 : 0);
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", department=" + department + "}";
    }
}
