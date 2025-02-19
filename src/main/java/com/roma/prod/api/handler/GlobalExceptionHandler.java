package com.roma.prod.api.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handlerException(Exception ex){
		return new ResponseEntity<>("Erro interno" + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
