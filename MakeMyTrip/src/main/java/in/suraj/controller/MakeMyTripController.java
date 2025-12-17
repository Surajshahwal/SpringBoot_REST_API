package in.suraj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import in.suraj.request.Passenger;
import in.suraj.responce.Ticket;
import in.suraj.service.MakeMyTripService;

@Controller
public class MakeMyTripController {
	@Autowired
	private MakeMyTripService service;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/search")
	public String searchPage() {
		return "search";
	}

	@GetMapping("/searchTicket")
	public String searchTicket(@RequestParam("ticketId") String ticketId, Model model) {
		Ticket ticketInfo = service.getTicketInfo(ticketId);
		model.addAttribute("ticket", ticketInfo);
		return "search";
	}

	@PostMapping("/bookTicket")
	public String bookTicket(Passenger passenger, Model model) {
		Ticket ticketinfo = service.processTicketBooking(passenger);

		model.addAttribute("ticket", ticketinfo);

		return "success";
	}
}
