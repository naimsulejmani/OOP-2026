package introduction.summary;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private LocalDate bestBefore;


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = BigDecimal.valueOf(price);
    }
}
