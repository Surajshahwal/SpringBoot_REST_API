package in.suraj.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
@Service
public class MakeMyTripServices {
	@Value("${irctc.endpoint.book.ticket}")
	private String IRCTC_BOOK_TICKET_URL;
	@Value("${irctc.endpoint.get.ticket}")
	private String IRCTC_GET_TICKET_URL;

public void getTicketInfoSync(String ticketId) {

	System.out.println("Syn-Method Started....");
	WebClient webClient = WebClient.create();
	String responce = webClient.get()
	         .uri(IRCTC_GET_TICKET_URL, ticketId)
	         .accept(MediaType.APPLICATION_JSON)
	         .retrieve()
	         .bodyToMono(String.class)
	         .block();
	System.out.println(responce);
	System.out.println("Syn-Method ended....");
	
}

public void getTicketInfoAsync(String ticketId) {
	System.out.println("ASyn-Method Started....");
	WebClient webClient = WebClient.create();
	webClient.get()
	         .uri(IRCTC_GET_TICKET_URL,ticketId)
	         .accept(MediaType.APPLICATION_JSON)
	         .retrieve()
	         .bodyToMono(String.class)
	         .subscribe(responce-> handleResponce(responce));
	System.out.println("ASyn-Method Ended....");
	

}
public void handleResponce(String responce) {
	System.out.println(responce);
}
}

