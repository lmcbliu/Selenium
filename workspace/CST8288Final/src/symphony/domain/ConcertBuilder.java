package symphony.domain;

import java.text.ParseException;
import java.util.Date;

public class ConcertBuilder{
	
			
			 ID concertId;
			 Date startDate;
			 Place venuePlace;
			 Conductor conductor;
			 Performance performance;

	    public ConcertBuilder(ID concertId ) {
	      this.concertId = concertId;
	    }
	    
	    public ConcertBuilder conductor(Conductor conductor) {
		      this.conductor =  conductor;
		      return this;
		    }
	    
	    public ConcertBuilder startDate(String date) throws ParseException {
	    	ActivityDate ad= new ActivityDate();
			ad.setDate(date);
			Date concertDate = ad.getDate();
			this.startDate = concertDate;
			  return this;
	    }

	    public ConcertBuilder performance (Performance performance) {
	      this.performance = performance;
	      return this;
	    }

	    public ConcertBuilder venuePlace(Place venuePlace) {
	      this.venuePlace = venuePlace;
	      return this;
	    }

	    
	    public Concert build() {
	      return new Concert(this);
	    }

	  }


