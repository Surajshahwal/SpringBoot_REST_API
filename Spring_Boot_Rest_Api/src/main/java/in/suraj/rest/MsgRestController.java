package in.suraj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
@GetMapping("/msg")
	public String getMsg() {
		return "good evening";
	}

@GetMapping("/welcome")
public ResponseEntity<String> getWelocome(){
	String msg= "Welcome to ashokit";
	
	return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
	
}

@GetMapping("/greet")
public String getGreet() {
	return "good morning";
}
}
