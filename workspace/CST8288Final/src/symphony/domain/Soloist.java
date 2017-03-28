package symphony.domain;

import java.util.ArrayList;
import java.util.List;

public class Soloist extends Player {
	
	public  ArrayList<String> expertise;
	
	public Soloist(ID id, Name name, Address address,PhoneNumber phoneNumber, ArrayList<String> expertise ){
		super(id, name,address,	phoneNumber);
		this.expertise = expertise;
				
	}

	public List<String> getExpertise() {
		return expertise;
	}

	public void setExpertise(ArrayList<String> expertise) {
		this.expertise = expertise;
	}



	
	


}
