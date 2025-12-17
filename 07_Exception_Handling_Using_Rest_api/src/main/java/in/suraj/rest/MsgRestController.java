package in.suraj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.suraj.service.CustomerService;

@RestController
public class MsgRestController {
	@Autowired
	private CustomerService service;

	@GetMapping("/customer/{customerId}")
	public String getCustomerName(@PathVariable Integer customerId) throws Exception {
		String customerNameById = service.getCustomerNameById(customerId);
		return customerNameById;
	}
	
}
