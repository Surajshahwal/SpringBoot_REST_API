package in.suraj.rest;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import in.suraj.binding.User;

@RestController
public class UserRestController {
	@GetMapping("/user")
	public ResponseEntity<User> getUser() {
		User user=new User(100, "sneha", "sneha@gmail.com");
		user.add(linkTo(methodOn(UserRestController.class).getUser()).withSelfRel());

		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@PostMapping("/user")
	public ResponseEntity<User> createUser( @RequestBody User user) {
	
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@PatchMapping("/user")
	public ResponseEntity<User> updateUser( @RequestBody User user) {
	
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String>deleteUser( @PathVariable Integer id) {
	
		return new ResponseEntity<>("deleted", HttpStatus.OK);
	}

}
