package introduction.nested_class.anonymous_class;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product  {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate dueDate;
    private boolean isActive;
    private String category;
    private long stock;

    public Product(int id, String name, String description, BigDecimal price, LocalDate dueDate, boolean isActive, String category, long stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.dueDate = dueDate;
        this.isActive = isActive;
        this.category = category;
        this.stock = stock;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", dueDate=" + dueDate + ", isActive=" + isActive + ", category=" + category + ", stock=" + stock + "]";
    }

}
