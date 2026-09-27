package exceptions;

/**
 * Бросается при попытке создать сладость с невалидными параметрами:
 * пустое название, отрицательный вес, отрицательные калории.
 */
public class InvalidSweetParameterException extends RuntimeException {

    public InvalidSweetParameterException(String message) {
        super(message);
    }

    public InvalidSweetParameterException(String message, Throwable cause) {
        super(message, cause);
    }
}