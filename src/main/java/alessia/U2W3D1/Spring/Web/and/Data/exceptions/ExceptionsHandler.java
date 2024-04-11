package alessia.U2W3D1.Spring.Web.and.Data.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ExceptionsHandler {
    @ExceptionHandler(BadRequestException.class)

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionsPayload handleBadRequest(BadRequestException ex){
        return new ExceptionsPayload(ex.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)

    public ExceptionsPayload handleNotFound(NotFoundException ex){
        return new ExceptionsPayload(ex.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionsPayload handleGenericErrors(Exception ex){
        ex.printStackTrace();
        return new ExceptionsPayload("Problema interno", LocalDateTime.now());
    }
}
