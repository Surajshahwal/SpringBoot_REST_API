package in.suraj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.suraj.entity.Customer;


@RestController
public class CustomerRestController {
	
	
	
	
	
@GetMapping(value = "/customer",
produces = {"application/xml","application/json"}
		)
	public Customer getCustomer() {
		Customer c=new  Customer();
		c.setName("raju");
		c.setEmail("sien@gmail.com");
		c.setGender("male");
		return c;
	}
@PostMapping(value = "/customer",
consumes = {"application/xml","application/json"},
produces = "plain/text"

)
public ResponseEntity<String> addCustomer( @RequestBody Customer customer){
	
	System.out.println(customer);
	//logic to insert customer in db
	return new ResponseEntity<String>("customer saved",HttpStatus.CREATED);
}

}
