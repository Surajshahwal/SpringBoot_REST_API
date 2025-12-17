package in.suraj.rest;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.suraj.reponce.Ticket;
import in.suraj.request.Passenger;

@RestController
public class TrainRestController {
	private Map<Integer, Ticket> tickets = new HashMap<>();
	
	int ticketId = 100;

	@PostMapping(value = "/ticket", 
			         consumes = { "application/json", "application/xml" },
			         produces ={ "application/json", "application/xml" }

	)

	public Ticket bookTicket(@RequestBody Passenger passenger) {
		Ticket ticket = new Ticket();
		

		ticket.setId(ticketId);
		ticket.setFname(passenger.getFname());
		ticket.setLname(passenger.getLname());
		ticket.setGender(passenger.getGender());
		ticket.setAge(passenger.getAge());
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setDoj(passenger.getDoj());
		ticket.setTrainNo(passenger.getTrainNo());
		ticket.setTicketCost("1500.00 INR");
		ticket.setTicketStatus("Confirm");

		tickets.put(ticketId, ticket);
		ticketId++;

		return ticket;

	}

	@GetMapping(value = "/ticket/{ticketId}",
 produces ={ "application/json", "application/xml" })
	public Ticket getTicket(@PathVariable Integer ticketId) {
		if (tickets.containsKey(ticketId)) {
			return tickets.get(ticketId);

		} else {
			return null;
		}

	}

}
