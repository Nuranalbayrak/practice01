package exceptions;

public class InvalidEmailIdCheckedException extends Exception{
    public InvalidEmailIdCheckedException(String message){
        super(message);
    }
}
