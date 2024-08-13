package BOOKMYSHOW.bookmyshow.CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BOOKMYSHOW.bookmyshow.ENTITY.ShowEntity;
import BOOKMYSHOW.bookmyshow.ENTITY.TicketEntity;
import BOOKMYSHOW.bookmyshow.SERVICE.BookMyShowService;

@RestController
@RequestMapping("bookmyshow")
public class BookMyShowController {

	@Autowired
	BookMyShowService bookMyShowService;
	
	@GetMapping("getTheatres")
	public ArrayList<String> getTheatres()
	{
		return bookMyShowService.getTheatres();
	}
	
	@GetMapping("/ags/getAllShows")
	public List<ShowEntity> getAllShows()
	{
		return bookMyShowService.getAllShow();
	}
	
	
	@GetMapping("shows/{showId}")
	public ShowEntity getAllShow(@PathVariable(value="showId") int id)
	{
		return bookMyShowService.getShow(id);
	}
	
	
	@PostMapping("/book")
	public TicketEntity book(@RequestBody TicketEntity ticketEntity) {
	     return bookMyShowService.book(ticketEntity);
	}
}