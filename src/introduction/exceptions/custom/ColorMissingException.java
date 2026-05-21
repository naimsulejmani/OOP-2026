package introduction.exceptions.custom;

//unchecked exceptions
public class ColorMissingException extends RuntimeException {
    public ColorMissingException() {
    }

    public ColorMissingException(String message) {
        super(message);
    }

    public ColorMissingException(String message, Throwable cause) {
        super(message, cause);
    }
}
