package BOOKMYSHOW.bookmyshow.ENTITY;



public class ShowEntity {

	private int movieId;
	private String showTime;
	private int availableTickets;
	
	public ShowEntity() {
		
	}

	public ShowEntity(int movieId, String showTime, int availableTickets) {
		super();
		this.movieId = movieId;
		this.showTime = showTime;
		this.availableTickets = availableTickets;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}
	
	
	
	
}

