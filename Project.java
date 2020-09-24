// Create the Project class with 13 private attributes.
// All attributes are created as private to that they cannot
// be modified by external classes.
public class Project {
	// Fields/attributes for the Project class.
	private String projectNumber;
	private String projectName;
	private String buildingType;
	private String physicalAddress;
	private String ERFNumber;
	private String totalFee;
	private String totalPaid;
	private String projectDeadline;
	private String projectStatus;
	private String projectCompletionDate;
	
	// The Person class has 4 fields which have been created in
	// the 'Person.java' file. The Person objects are fields of the
	// Project objects.
	private Person projectArchitect; 
	private Person projectContractor;
	private Person projectCustomer;
	
	
	// Constructors that can be called by external classes.
	
	// Define a constructor with all the attributes as parameters.
	public Project(String projectNumber, String projectName, String buildingType, 
			String physicalAddress, String ERFNumber, String totalFee, String totalPaid,
			String projectDeadline, Person projectArchitect, Person projectContractor, 
			Person projectCustomer, String projectStatus, String projectCompletionDate){
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.physicalAddress = physicalAddress;
		this.ERFNumber = ERFNumber;
		this.totalFee = totalFee;
		this.totalPaid = totalPaid;
		this.projectDeadline = projectDeadline;
		this.projectArchitect = projectArchitect;
		this.projectContractor = projectContractor;
		this.projectCustomer = projectCustomer;
		this.projectStatus = projectStatus;
		this.projectCompletionDate = projectCompletionDate;
	}
	
	// Define a second constructor, which only as some of the 
	// fields (as needed) as parameters. This is the same as
	// method overloading.
	public Project(String projectNumber, String projectName, String buildingType, 
			String physicalAddress, String ERFNumber, String totalFee, String totalPaid,
			String projectDeadline, Person projectArchitect, Person projectContractor, 
			Person projectCustomer){
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.physicalAddress = physicalAddress;
		this.ERFNumber = ERFNumber;
		this.totalFee = totalFee;
		this.totalPaid = totalPaid;
		this.projectDeadline = projectDeadline;
		this.projectArchitect = projectArchitect;
		this.projectContractor = projectContractor;
		this.projectCustomer = projectCustomer;
		
	}
	// Also another overloaded constructor, with only a few
	// fields as parameters.
	public Project(String projectNumber, String projectName,String projectStatus, String projectCompletionDate){
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.projectStatus = projectStatus;
		this.projectCompletionDate = projectCompletionDate;
	
	}
	
	// Methods that can be used by external classes.
	
	// The toString method prints out all the fields values in 
	// a readable format. This is primary based on the fields
	// for the second constructor as it is used the most often 
	// in this program.
	public String toString(){
		String output = "Project Name: " + this.projectName;
		output += "\nProject Number: " + this.projectNumber;
		output += "\nBuilding type to design: " + this.buildingType;
		output += "\nPhysical address of project: " + this.physicalAddress;
		output += "\nERF Number: " + this.ERFNumber;
		output += "\nTotal Fee: " + this.totalFee;
		output += "\nTotal paid to date: " + this.totalPaid;
		output += "\nProject Deadline: " + this.projectDeadline;
		output += "\n";
		output += "\nArchitect Details"; 
		output += "\n" + this.projectArchitect;
		output += "\n";
		output += "\nContractor Details "; 
		output += "\n" + this.projectContractor;
		output += "\n";
		output += "\nCustomer Details "; 
		output += "\n" + this.projectCustomer;
		
		return output;
	}
	// Method to return the value of the project number attribute for 
	// a specific object.
	public String getProjectNumber(){
		return this.projectNumber;
	}
	
	// Method to return the value of the project name attribute for 
	// a specific object. 
	public String getProjectName(){
		return this.projectName;
	}
	
	// Method to return the value of the Architect for a specific
	// object. The Architect attribute is in fact
	// an object as well of the Person class.
	public Person getProjectArchtect(){
		return this.projectArchitect;
	}
	
	// Method to return the value of the Contractor for a specific
	// object. The Contractor attribute is in fact
	// an object as well of the Person class.
	public Person getProjectContractor(){
		return this.projectContractor;
	}
	
	// Method to return the value of the Customer for a specific
	// object. The Customer attribute is in fact
	// an object as well of the Person class.
	public Person getProjectCustomer(){
		return this.projectCustomer;
	}
	
	// Method to return the value of the project deadline attribute for 
		// a specific object.
	public String getProjectDeadline(){
		return this.projectDeadline;
	}
	
	// Method to return the value of the project total fee attribute for 
		// a specific object.
	public String getProjectFee(){
		return this.totalFee;
	}
	
	// Method to return the value of the total paid up to date attribute for 
		// a specific object.
	public String getProjectTotalPaid(){
		return this.totalPaid;
	}
	
	// Method to return the value of the project completion attribute for 
		// a specific object.
	public String getProjectCompletionDate(){
		return this.projectCompletionDate;
	}
	
	// Method to return the value of the project status attribute for 
	// a specific object.
	public String getProjectStatus(){
		return this.projectStatus;
	}
	
	// Method to return the value of the project due date attribute for 
	// a specific object.
	public void setDueDate(String DueDate){
		this.projectDeadline = DueDate;
	}
	
	// Method to set the value of the total paid attribute for 
	// a specific object. This allows to change the value of the 
	// field indirectly by an external class. 
	public void setTotalPaid(String totalPaid){
		this.totalPaid = totalPaid;
	}
	
	// Method to set the value of the project status for 
	// a specific object. This allows to change the value of the 
	// field indirectly by an external class. 
	public void setProjectStatus(String projectStatus){
		this.projectStatus = projectStatus;
	}
	
	// Method to set the value of the project completion date for 
	// a specific object. This allows to change the value of the 
	// field indirectly by an external class. 
	public void setprojectCompletionDate(String projectCompletionDate){
		this.projectCompletionDate= projectCompletionDate;
	}
	
	
	
	
	
}
