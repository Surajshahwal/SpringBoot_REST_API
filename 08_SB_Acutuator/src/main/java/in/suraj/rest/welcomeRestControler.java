package in.suraj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeRestControler {
	@GetMapping("/welcome")
	public String getWelcome() {
		return "welocme to my room";
	}

}
