package project.finalproject.factory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityFactory {
    public static <T> ResponseEntity<T> createResponseEntity(T body, HttpStatus status) {
        return new ResponseEntity<>(body, status);
    }
    
    public static <T> ResponseEntity<T> createResponseEntity(HttpStatus status) {
        return new ResponseEntity<>(status);
    }
}
