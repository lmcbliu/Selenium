package concert;

import java.util.ArrayList;
import java.util.List;

public class Concert {
	
	private List<Item> items = new ArrayList<Item>();	

	
	   public void addItem(Item item){
		      items.add(item);
		   }
	   
	   public void showItems(){
		   
		      for (Item item : items) {
		    	  System.out.println("player name : " + item.getName());
		    	  System.out.println("player id : " + item.getId());
		      }		
	   }
}
