package introduction.composition_and_aggregation.db_example;

import java.util.Arrays;
import java.util.List;

public class Category {
    private int id; //categoryId
    private String name; //categoryName
    private String description;
    private byte[] picture;

    private List<Product> products;

    public Category() {
    }

    public Category(int id, String name, String description, byte[] picture) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.picture = picture;
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

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", picture=" + Arrays.toString(picture) +
                ", total products=" + products.size() +
                '}';
    }
}
