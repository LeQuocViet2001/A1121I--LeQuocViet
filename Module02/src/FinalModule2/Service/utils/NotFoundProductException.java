package FinalModule2.Service.utils;

public class NotFoundProductException extends  Exception{
    public NotFoundProductException() {
    }

    public NotFoundProductException(String message) {
        super(message);

    }
}
