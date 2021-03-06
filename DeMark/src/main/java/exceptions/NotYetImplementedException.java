package exceptions;

/**
 * Exception class to help with writing tests before the tested function is implemented
 */
public class NotYetImplementedException extends Exception {
    /**
     * Constructor to implement a custom Java exception that represents a functionality/method that is not yet
     * implemented. Used for testing and temporary development purposes.
     * @param message
     */
    public NotYetImplementedException(String message) {
        super(message);
    }

    public NotYetImplementedException() {
        super("");
    }
}