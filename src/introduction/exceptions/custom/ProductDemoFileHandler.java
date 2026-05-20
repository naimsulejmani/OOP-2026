package introduction.exceptions.custom;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class ProductDemoFileHandler {
    private static Logger logger = Logger.getLogger(ProductDemoFileHandler.class.getName());

    static void main() throws IOException {
        logger.setLevel(Level.SEVERE);
        FileHandler fileHandler = new FileHandler("files/product.log");
        logger.addHandler(fileHandler);

        XMLFormatter xmlFormatter = new XMLFormatter();
        fileHandler.setFormatter(xmlFormatter);

        Product product = null;
        try {
            product = new Product(1, "Bread", 10, LocalDate.of(2020, 1, 1));
        } catch (ProductException e) {
//            logger.severe("Product error: " + e.getMessage());
            logger.log(Level.SEVERE, e.getMessage(), e);
        }


    }
}
