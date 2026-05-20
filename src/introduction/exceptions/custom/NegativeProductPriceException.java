package introduction.exceptions.custom;

public class NegativeProductPriceException extends ProductException {
    public NegativeProductPriceException() {
    }

    public NegativeProductPriceException(String message) {
        super(message);
    }

    public NegativeProductPriceException(String message, Throwable cause) {
        super(message, cause);
    }
}
