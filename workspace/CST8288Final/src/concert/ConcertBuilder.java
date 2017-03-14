package concert;

public class ConcertBuilder {
	
	public Concert preparConcert (){
	      Concert concert = new Concert();
	      concert.addItem(new Conductor());
	      concert.addItem(new Soloist());
	      return concert;
	   }   

	  

}
