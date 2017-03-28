package symphony.domain;


public abstract class Player {
	
	
	ID id;
	Name name;
	Address address;
	PhoneNumber phoneNumber;
	
	
	
	public Player(ID id, Name name,	Address address,	PhoneNumber phoneNumber  ){
		
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber= phoneNumber;
		
		
	}



	public ID getId() {
		return id;
	}



	public void setId(ID id) {
		this.id = id;
	}



	public Name getName() {
		return name;
	}



	public void setName(Name name) {
		this.name = name;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	



	

}
