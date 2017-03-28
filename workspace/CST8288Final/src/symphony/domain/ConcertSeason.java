package symphony.domain;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class ConcertSeason extends ArrayList<Concert> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Date startDate;
	
	int length;
	
	
	
	private ConcertSeason(){ 	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(String date) throws ParseException {
		
		ActivityDate ad= new ActivityDate();
		ad.setDate(date);
		Date ConcertSeasonDate = ad.getDate();
		this.startDate = ConcertSeasonDate;
	
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean add(Concert concert){
		return super.add(concert);
	}
	
	public static ConcertSeason getConcertSeason(){
		
		return new ConcertSeason();
	}
	

}
