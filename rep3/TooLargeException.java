public class TooLargeException extends RuntimeException {

    public TooLargeException() {

    }

    public TooLargeException(String message) {
        super(message);
    }

    public TooLargeException(String message, Throwable cause) {
        super(message, cause);
    }
}