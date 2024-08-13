package BOOKMYSHOW.bookmyshow.SERVICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import BOOKMYSHOW.bookmyshow.ENTITY.ShowEntity;
import BOOKMYSHOW.bookmyshow.ENTITY.TicketEntity;

@Service
public class BookMyShowService {

	@Autowired
	RestTemplate restTemplate;
	
	ArrayList<String> theatres = new ArrayList<>();
	
	BookMyShowService(){
		theatres.add("AGS Cinemas");
		theatres.add("Rohini Silver Screens");
	}
	
	public ArrayList<String> getTheatres()
	{
		return theatres;
	}
	
	public List<ShowEntity> getAllShow()
	{
		String URL = "http://localhost:8080/shows";
		  ResponseEntity<List<ShowEntity>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
	                new ParameterizedTypeReference<List<ShowEntity>>() {});
	      return responseEntity.getBody();

	}
	
	
	 public ShowEntity getShow(int id)
	    {
	        String URL = "http://localhost:8080/shows/{showId}";
	        
	        Map<String, Integer> uriVariables = Map.of("showId", id);
	        
	        ResponseEntity<ShowEntity> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
	                new ParameterizedTypeReference<ShowEntity>() {}, uriVariables);
	        
	        return responseEntity.getBody();
	    }
	 
	 public TicketEntity book(TicketEntity ticketEntity) {
	        String URL = "http://localhost:8080/book";
	        
	        HttpEntity<TicketEntity> request = new HttpEntity<>(ticketEntity);
	        
	        ResponseEntity<TicketEntity> responseEntity = restTemplate.exchange(URL, HttpMethod.POST, request,
	                new ParameterizedTypeReference<TicketEntity>() {});
	        
	        return responseEntity.getBody();
	    }
}
