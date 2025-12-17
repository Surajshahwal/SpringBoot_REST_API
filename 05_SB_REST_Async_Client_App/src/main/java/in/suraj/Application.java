package in.suraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.suraj.service.MakeMyTripServices;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	 MakeMyTripServices bean = context.getBean(MakeMyTripServices.class);
		/* bean.getTicketInfoSync("101"); */
	 bean.getTicketInfoAsync("101");
	}

}
