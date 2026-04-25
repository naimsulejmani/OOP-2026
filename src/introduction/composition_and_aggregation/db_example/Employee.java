package introduction.composition_and_aggregation.db_example;

import java.time.LocalDate;
import java.util.List;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private LocalDate hireDate;
    private String title;
    private Employee reportsTo;

    private List<Employee> subordinates;

    private List<Order> orders;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, LocalDate birthdate, LocalDate hireDate, String title, Employee reportsTo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.hireDate = hireDate;
        this.title = title;
        this.reportsTo = reportsTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", hireDate=" + hireDate +
                ", title='" + title + '\'' +
                ", reportsTo=" + reportsTo +
                ", total subEmployees=" + subordinates.size() +
                ", total orders=" + orders.size() +
                '}';
    }
}
