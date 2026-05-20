package introduction.exceptions.custom;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private double price;
    private LocalDate bestBefore;

    public Product(int id, String name, double price, LocalDate bestBefore) throws ProductException {
        this.id = id;
        this.name = name;
        setPrice(price);
        setBestBefore(bestBefore);
    }

    // Getters and setters
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws NegativeProductPriceException {
        if (price < 0) {
            throw new NegativeProductPriceException("Price cannot be negative");
        }
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) throws ProductException {
        if (bestBefore == null) {
            throw new IllegalArgumentException("Best before date cannot be null");
        }
        if (bestBefore.isBefore(LocalDate.now())) {
            throw new ProductException("Best before date cannot be in the past");
        }
        this.bestBefore = bestBefore;
    }
}
