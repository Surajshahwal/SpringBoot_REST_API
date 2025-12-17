package in.suraj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI customeOpenApi() {
		return new OpenAPI().info(new Info().title("Train Ticket Booking API").version("1.0")
				.description("API Documenttation for SpringBoot 3.5.7 using SpringDoc _OpenApi"));

	}
}
