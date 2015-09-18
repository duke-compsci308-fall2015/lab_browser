/**
 * Represents an exceptional situation specific to this project.
 *
 * @author Robert C. Duvall
 */
public class BrowserException extends RuntimeException {
    // for serialization
    private static final long serialVersionUID = 1L;

    /**
     * Create an exception based on an issue in our code.
     */
    public BrowserException (String message, Object ... values) {
        super(String.format(message, values));
    }
    
    /**
     * Create an exception based on a caught exception with a different message.
     */
    public BrowserException (Throwable cause, String message, Object ... values) {
        super(String.format(message, values), cause);
    }

    /**
     * Create an exception based on a caught exception, with no additional message.
     */
    public BrowserException (Throwable exception) {
        super(exception);
    }
}
