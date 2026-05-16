package introduction.inheritance.payroll_hr;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;
    private double bonusPercentage;

    public SalariedEmployee(int id, String name, String surname, LocalDate dateOfBirth, LocalDate hireDate, double salary, double bonusPercentage) {
        super(id, name, surname, dateOfBirth, hireDate);
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double pay() {
        return salary + (salary * bonusPercentage / 100);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() + ", salary=" + salary + ", bonusPercentage=" + bonusPercentage + "}";
    }
}
