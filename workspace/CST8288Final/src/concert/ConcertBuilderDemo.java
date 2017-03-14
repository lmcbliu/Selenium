package concert;

public class ConcertBuilderDemo {
	
	 public static void main(String[] args) {
		   
	
	ConcertBuilder concertBuilder = new ConcertBuilder();

   Concert concert =  concertBuilder.preparConcert();
   
   System.out.println("Concert");
   
    concert.showItems();
    
  
    
	 }

}
