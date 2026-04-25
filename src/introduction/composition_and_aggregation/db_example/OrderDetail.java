package introduction.composition_and_aggregation.db_example;

public class OrderDetail {
    private int id;
    private Product product;
    private Order order;
    private int quantity;
    private double unitPrice;
    private double discount;//0.00 - 1.00 -> 0.10 -> 10%

    public OrderDetail() {
    }

    public OrderDetail(int id, Product product, Order order, int quantity, double unitPrice, double discount) {
        this.id = id;
        this.product = product;
        this.order = order;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSubtotal() {
        return quantity * unitPrice * (1 - discount);
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", product=" + product +
                ", order=" + order +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", discount=" + discount +
                '}';
    }
}
