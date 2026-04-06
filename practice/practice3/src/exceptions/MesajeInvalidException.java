package exceptions;

public class MesajeInvalidException extends RuntimeException {

    public MesajeInvalidException (String message) {
        super(message);
    }
}
