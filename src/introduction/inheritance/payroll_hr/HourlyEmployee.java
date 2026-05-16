package introduction.inheritance.payroll_hr;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private double hours;
    private double hourlyWage;

    public HourlyEmployee(int id, String name, String surname, LocalDate dateOfBirth, LocalDate hireDate, double hours, double hourlyWage) {
        super(id, name, surname, dateOfBirth, hireDate);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double pay() {
        return hours * hourlyWage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() + ", hours=" + hours + ", hourlyWage=" + hourlyWage + "}";
    }
}
