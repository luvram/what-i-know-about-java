package my.java.exceptions;

public class NestedException extends RuntimeException {
    public NestedException(Throwable cause) {
        super(cause);
    }
}
