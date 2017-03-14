package concert;

import java.util.Scanner;

public abstract class Player implements Item{
	
	
	
	String name;
	int id;
	
	public Player( ){
		
		System.out.println("Please enter the name");
		Scanner input = new Scanner (System.in);
		this.name= input.nextLine();
	
		System.out.println("Please enter the ID");
		this.id= input.nextInt();
		//input.close();
		
	}
	
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int iD) {
		this.id = id;
	}
	

}
