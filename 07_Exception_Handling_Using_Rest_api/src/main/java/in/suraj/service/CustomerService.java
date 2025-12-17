package in.suraj.service;

import org.springframework.stereotype.Service;

import in.suraj.exception.CustomerNotFoundException;

@Service
public class CustomerService {
	
public String getCustomerNameById(Integer customerId) {
	if ( customerId >=100) {
		return "john";
		
	}else {
	 throw new CustomerNotFoundException("Invalid customer id");
	}
}
}
