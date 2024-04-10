package alessia.U2W3D1.Spring.Web.and.Data.exceptions;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
