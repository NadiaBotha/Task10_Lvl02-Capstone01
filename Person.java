// Create the Person class with 4 private fields.
// Private field values cannot be accessed directly by an external
// class. 
public class Person {
	// Fields/attributes defined for the Person class.
	private String personName;
	private String telephoneNumber;
	private String emailAddress;
	private String physicalAddress;
	
	// Constructors defined for the Person class.
	public Person(String personName, String telephoneNumber, String emailAddress, String physicalAddress){
		this.personName = personName;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	// Methods defined for the Person class.
	
	// Method toString defined which prints all the field values
	// for the Person object in a readable format.
	public String toString(){
		String output = "Name: " + this.personName;
		output += "\nTelephone Number: " + this.telephoneNumber;
		output += "\nEmail Address: " + this.emailAddress;
		output += "\nPhysical Address: " + this.physicalAddress;
		
		return output;
	}
	
	// Return the value for the person name attribute for a specific
	// object.
	public String getPersonName(){
		return this.personName;
	}
	
	// Set the value of the person name. This method enables external
	// classes to set this value indirectly.
	public void setPersonName(String personName){
		this.personName = personName;
	}
	// Set the value of the person number. This method enables external
		// classes to set this value indirectly.
	public void setPersonNumber(String personTelePhoneNumber){
		this.telephoneNumber = personTelePhoneNumber;
	}
	
	// Set the value of the person Email. This method enables external
	// classes to set this value indirectly.
	public void setPersonEmail(String personEmail){
		this.emailAddress = personEmail;
	}
	
	// Set the value of the person address. This method enables external
	// classes to set this value indirectly.
	public void setPersonAddress(String personAddress){
		this.telephoneNumber = personAddress;
	}
	
}
