package introduction.composition_and_aggregation.db_example;

import java.util.List;

public class Customer {
    private long id;
    private String companyName;

    private List<Order> orders;

    public Customer() {

    }

    public Customer(long id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", total orders=" + orders.size() +
                '}';
    }
}
