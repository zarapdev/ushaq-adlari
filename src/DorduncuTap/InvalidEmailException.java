package DorduncuTap;

public class InvalidEmailException extends RuntimeException{
    InvalidEmailException (String message){
        super(message);
    }
}
