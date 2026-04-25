package introduction.composition_and_aggregation.db_example;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private long id;
    private LocalDate orderDate;
    private LocalDate requiredDate;
    private LocalDate shippedDate;
    private String freight;
    private Customer customer;
    private Shipper shipper;
    private Employee employee;

    private List<OrderDetail> orderDetails;

    public Order() {
    }

    public Order(long id, LocalDate orderDate, LocalDate requiredDate, LocalDate shippedDate, String freight, Customer customer, Shipper shipper, Employee employee) {
        this.id = id;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.freight = freight;
        this.customer = customer;
        this.shipper = shipper;
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

    public LocalDate getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDate shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", requiredDate=" + requiredDate +
                ", shippedDate=" + shippedDate +
                ", freight='" + freight + '\'' +
                ", customer=" + customer.getCompanyName() +
                ", shipper=" + shipper.getName() +
                ", employee=" + employee.getFirstName() + " " + employee.getLastName() +
                ", orderDetails=" + orderDetails +
                '}';
    }

    public void print() {
        System.out.printf("OrderID: " + id);
        System.out.println("\nOrder Date: " + orderDate);
        System.out.println("Required Date: " + requiredDate);
        System.out.println("Shipped Date: " + shippedDate);
        System.out.println("Freight: " + freight);
        System.out.println("Customer: " + customer.getCompanyName());
        System.out.println("Shipper: " + shipper.getName());
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Order Details:");
        double total = 0;
        System.out.println("---------------------------------------------------");
        for (OrderDetail orderDetail : orderDetails) {
            System.out.println("\tProduct: " + orderDetail.getProduct().getName());
            System.out.println("\tQuantity: " + orderDetail.getQuantity());
            System.out.println("\tUnit Price: " + orderDetail.getUnitPrice());
            System.out.println("\tDiscount: " + orderDetail.getDiscount());
            System.out.println("\tSubtotal: " + orderDetail.getSubtotal());
            total += orderDetail.getSubtotal();
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Total: " + total+" EUR");
    }
}
