package com.bni.wdl.epayroll.exception;

import com.bni.wdl.epayroll.enums.ErrorCode;
import com.bni.wdl.epayroll.model.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    // Handle if data not found exception
    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ResponseDto<String>> handleDataNotFoundException(DataNotFoundException e) {
        ResponseDto<String> dataNotFoundExceptionResponse = new ResponseDto<>();
        dataNotFoundExceptionResponse.setCode(ErrorCode.DATA_NOT_FOUND.getErrorCode());
        dataNotFoundExceptionResponse.setMessage(ErrorCode.DATA_NOT_FOUND.getErrorMessage());
        dataNotFoundExceptionResponse.setData(ErrorCode.DATA_NOT_FOUND.getErrorMessage());
        log.error("=====> Data not found exception error happen cause by {}", e.getMessage());
        return new ResponseEntity<>(dataNotFoundExceptionResponse, HttpStatus.NOT_FOUND);
    }


    // Fallback handle unhandled exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto<String>> handleGlobalException(Exception e){
        ResponseDto<String> globalExceptionResponse = new ResponseDto<>();
        globalExceptionResponse.setCode(ErrorCode.GENERAL_ERROR.getErrorCode());
        globalExceptionResponse.setMessage(ErrorCode.GENERAL_ERROR.getErrorMessage());
        globalExceptionResponse.setData(ErrorCode.GENERAL_ERROR.getErrorMessage());
        log.error("=====> Exception error happen cause by {}", e.getMessage());
        return new ResponseEntity<>(globalExceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
