package exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.jayway.jsonpath.spi.mapper.MappingException;
import java.util.UUID;
@RestControllerAdvice
public class ExceptionHandler{



    public ResponseEntity mappingException(final MappingException exception) {

        final String content = exception.getMessage();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("user this "+content+" not exist");
    }

}


