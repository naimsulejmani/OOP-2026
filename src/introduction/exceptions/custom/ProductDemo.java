package introduction.exceptions.custom;

import java.time.LocalDate;

public class ProductDemo {
    static void main() {
        try {
            Product product = new Product(1, "Bread", 10, LocalDate.of(2030, 1, 1));
            System.out.println(product.getName());
        } catch (NegativeProductPriceException e) {
            System.out.println(e.getMessage());
        } catch (ProductException e) {
            System.out.println("E More katil don me helmu popullin!");
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println("Cfare gabimi more hej!s");
            System.out.println(ex.getMessage());
//            ex.printStackTrace();
        } finally {
            System.out.println("Ky kod do te ekzekutohet gjithmone!");
        }
        System.out.println("A po vjen ketu");
    }
}
