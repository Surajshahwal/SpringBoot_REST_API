package in.suraj.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;

import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.suraj.request.Passenger;
import in.suraj.responce.Ticket;


@Service
public class MakeMyTripService {
	@Value("${irctc.endpoint.book.ticket}")
	private String IRCTC_BOOK_TICKET_URL;
	@Value("${irctc.endpoint.get.ticket}")
	private String IRCTC_GET_TICKET_URL;

	public Ticket getTicketInfo(String ticketId) {
		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> responseEntity =
		 * rt.getForEntity(IRCTC_GET_TICKET_URL, Ticket.class, ticketId); int satusCode
		 * = responseEntity.getStatusCodeValue(); if (satusCode == 200) { Ticket ticket
		 * = responseEntity.getBody(); return ticket; } return null;
		 */

		WebClient webClient = WebClient.create();

		Ticket ticket = webClient.get()
				.uri(IRCTC_GET_TICKET_URL, ticketId)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();

		if (ticket != null) {

			return ticket;
		}
		return null;

	}

	public Ticket processTicketBooking(Passenger passenger) {
		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> responseEntity =
		 * rt.postForEntity(IRCTC_BOOK_TICKET_URL, passenger, Ticket.class);
		 * 
		 * int statusCode = responseEntity.getStatusCodeValue(); if (statusCode == 200)
		 * { Ticket ticket = responseEntity.getBody(); return ticket; }
		 * 
		 * return null; }
		 */

		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
				.uri(IRCTC_BOOK_TICKET_URL)
				.body(BodyInserters.fromValue(passenger))
				.header("Content-Type", "application/json")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		
		
		if (ticket!=null) {
			return ticket;
			
		}
		return null;
	}

}
