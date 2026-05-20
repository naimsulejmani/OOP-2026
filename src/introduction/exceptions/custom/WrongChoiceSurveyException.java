package introduction.exceptions.custom;


public class WrongChoiceSurveyException extends Exception {
    public WrongChoiceSurveyException() {
    }

    public WrongChoiceSurveyException(String message) {
        super(message);
    }

    public WrongChoiceSurveyException(String message, Throwable cause) {
        super(message, cause);
    }
}
