package introduction.exceptions.custom;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDemo {
    private static Logger logger = Logger.getLogger(ProductDemo.class.getName());

    static void main() {
        logger.setLevel(Level.SEVERE);
        try {
            Product product = new Product(1, "Bread", 10, LocalDate.of(2020, 1, 1));
            System.out.println(product.getName());
        } catch (NegativeProductPriceException e) {
            logger.warning("Negative price error: " + e.getMessage());
        } catch (ProductException e) {
            System.out.println("E More katil don me helmu popullin!");
            logger.severe("Product error: " + e.getMessage());
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            logger.severe("Unexpected error: " + ex.getMessage());
            System.out.println("Cfare gabimi more hej!s");
            System.out.println(ex.getMessage());
//            ex.printStackTrace();
        } finally {
            System.out.println("Ky kod do te ekzekutohet gjithmone!");
            logger.info("Finished processing product.");
            logger.log(Level.FINEST, "This is a FINEST level log message.");

        }
        System.out.println("A po vjen ketu");
    }
}
