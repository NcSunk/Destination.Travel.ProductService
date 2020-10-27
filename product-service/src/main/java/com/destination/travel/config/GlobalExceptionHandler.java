package com.destination.travel.config;

import com.destination.travel.dto.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponse exceptionHandler(Exception e)
    {
        logger.error(e.getMessage(),e);
        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setSuccess(false);
        apiResponse.setMessage(e.getMessage());
        return apiResponse;
    }
}
