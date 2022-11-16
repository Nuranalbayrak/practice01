package exceptions;

public class InvalidEmailIdUnCheckedException extends RuntimeException {
    public InvalidEmailIdUnCheckedException(String message){
        super(message);
    }
}
