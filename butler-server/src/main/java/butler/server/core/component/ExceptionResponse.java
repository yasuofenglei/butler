package butler.server.core.component;

import butler.common.dto.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ControllerAdvice
public class ExceptionResponse {
    private final Logger logger = LoggerFactory.getLogger("butler");

    @ExceptionHandler
    @ResponseBody
    public ResponseData<String> exception(Exception e) {
        logger.info("Handle exception.", e);
        return ResponseData.error(500, e.getMessage());
    }
}
