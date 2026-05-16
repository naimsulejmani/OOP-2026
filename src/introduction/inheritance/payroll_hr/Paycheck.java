package introduction.inheritance.payroll_hr;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Paycheck {
    private Employee employee;
    private double amount;
    private double penalty;
    private int month;
    private int year;
    private LocalDate date;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Paycheck(Employee employee, double penalty, int month, int year, LocalDate date) {
        this.employee = employee;
        this.amount = employee.pay();
        this.penalty = penalty;
        this.month = month;
        this.year = year;
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void print() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Paycheck for " + employee.getName() + " " + employee.getSurname());
        System.out.println("Date: " + date);
        System.out.println("Month/Year: " + month + "/" + year);
        System.out.println("Amount: " + amount);
        System.out.println("Penalty: " + penalty);
        System.out.println("Total: " + (amount - penalty));
        System.out.println("Total Age: " + employee.getAge());
        System.out.println("Total Seniority: " + employee.getSeniority());
        System.out.println("Pensioner: " + (employee.getAge() > 65 ? "Yes" : "No"));
        System.out.println("Created At: " + createdAt);
        System.out.println("-------------------------------------------------------------------");
    }
}
