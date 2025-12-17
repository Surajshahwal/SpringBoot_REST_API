package in.suraj.exception;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleCnf(CustomerNotFoundException cnf){
		ExceptionInfo  info=new ExceptionInfo();
		info.setCode("EX0011");
		info.setMsg(cnf.getMessage());
		info.setDate(LocalDateTime.now());
		return new  ResponseEntity<ExceptionInfo>(info, HttpStatus.BAD_REQUEST);
	}

}
