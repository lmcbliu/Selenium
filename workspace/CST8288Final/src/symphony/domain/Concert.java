package symphony.domain;


import java.text.ParseException;
import java.util.Date;

public class Concert {
	
	ID concertId;
	Date startDate;
	Place venuePlace;
	Conductor conductor;
	Performance performance;
	
	public Concert(ConcertBuilder builder ){
		this.concertId=builder.concertId;
		this.startDate=builder.startDate;
		this.conductor=builder.conductor;
		this.venuePlace=builder.venuePlace;
		this.performance=builder.performance;
		
	}

	public ID getConcertId() {
		return concertId;
	}

	public void setConcertId(ID concertId) {
		this.concertId = concertId;
	}

	public Date getStartEndDate() {
		return startDate;
	}

	public void setStartDate(String date) throws ParseException {
		ActivityDate ad= new ActivityDate();
		ad.setDate(date);
		Date concertDate = ad.getDate();
		this.startDate = concertDate;
	}

	public Place getVenuePlace() {
		return venuePlace;
	}

	public void setVenuePlace(Place venuePlace) {
		this.venuePlace = venuePlace;
	}

	public Conductor getConductor() {
		
		
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public Performance getPerformance() {
		return performance;
	}

	public void setPerformance(Performance performance) {
		this.performance = performance;
	}

	
	
	
	
	   
}
