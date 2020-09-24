import java.util.Scanner;

// Define a class which holds all the methods. This is to reduce
// the size of the 'Poised.java' file. The 'methodsCont.java' has
// the same purpose.
public class methods {
	
	// To create a Project array, with the amount of entries defined
	// in arraySize. The fields of each entry is then initialized to 
	// null. In this case the second constructor is called in the
	// Project class file.
	public static Project[] createNullArray(int arraySize){
		// Creates a Project array with empty entries (place holders).
		// The number of entries are defined by the arraySize parameter.
		Project [] projectArray = new Project[arraySize];
		
		// Loops through the entries and sets each of the fields for 
		// every entry equal to null.
		for(int k = 0; k < arraySize; k++){
			projectArray[k] = new Project(null, null, null, null, null, 
					null, null, null, null, null, null);
		}
		// Return the complete array.
		return projectArray;
	}
	
	// The same as the method above, however another constructor
	// with more field parameters is called. It is the first 
	// constructor in the Project class file.
	public static Project[] createCompletedNullArray(int arraySize){
		Project [] projectArray = new Project[arraySize];
		
		for(int k = 0; k < arraySize; k++){
			projectArray[k] = new Project(null, null, null, null, null, 
					null, null, null, null, null, null, null, null);
		}
		return projectArray;
	}
	
	// As no text files are used to read and write data, all the
	// data is lost everytime the program is executed. To start the 
	// program with some initial objects, they are created manually
	// in the 'createPerson' method and added to the array which stores all the 
	// projects. For real-life practical application data will be read from and stored 
	// to text files.
	public static Person[] createPerson(int arraySize){	
		
		// Create a Persons array which has arraySize entries.
		Person [] persons = new Person[arraySize];
		
		// Set the 4 fields for each array entry equal to null to 
		// initialize it.
		for(int k = 0; k < arraySize; k++){
			persons[k] = new Person(null, null, null, null);
		}
		
		// Manually create Person objects with the field values identiefied
		// in the constructor parameters. Usually this data will be 
		// read from a text file.
		Person john = new Person("John Smith", "07345588777", "john@gmail.com", "10 Bayview Street, Cape Town");
		Person liza = new Person("Liza Johnson", "0824456789", "liza@gmail.com", "11 Tableview Street, Cape Town");
		Person ashton = new Person("Asthon Miller", "0794567788", "ashton@gmail.com", "44 Marine Drive, Cape Town");
		Person mike = new Person("Mike Williams", "0714466981", "mike@gmail.com", "15 Drama Street, Somerset West");
		Person lucy = new Person("Lucy Jones", "0864455123", "lucy@gmail.com", "784 Route 44, Stellenbosch");
		Person adrian = new Person("Andrian Brown", "0745648134", "adrian@gmail.com", "144 Main Road, Durbanville");
		Person jessica = new Person("Jessica Davis", "0741144789", "jessica@gmail.com", "7 Signal Hill Road, Cape Town");
		
		// Manually set the objects equal to Person array entries.
		persons[0] = john;
		persons[1] = liza;
		persons[2] = ashton;
		persons[3] = mike;
		persons[4] = lucy;
		persons[5] = adrian;
		persons[6] = jessica;
		
		// Return the full Person array.
		return persons;
	}
	
	// This is the same as above, but only for Project objects, 
	// instead of Person objects.
	public static Project[] createProject(Person Smith, Person Johnson, Person Miller, Person Williams, Person Jones, 
			Person Brown, Person Davis, int arraySize){	
		
		// Create a new Project array with arraySize entries and 
		// initialized entries of null. This is done by calling the
		// createNullArray method.
		Project projects[] = methods.createNullArray(arraySize);
		
		// Manually create 3 objects. Set the architect, contractor and customer equal to the Person objects created
		// above. All of the fields identified for the Person objects are automatically pulled.
		Project apartmentSmith = new Project("3", "Apartment Smith", "Apartment", "1 Marine Drive, Cape Town",
							"T0IQ00990000012300001", "100000.00", "10000.00", "20/05/2021", Miller, Williams, Smith);
		Project houseJohnson = new Project("2", "House Johnson", "House", "55 Beach Road, Gordon's Bay",
							"F00300110000012300001", "15500.00", "10000.00", "11/12/2020", Miller, Jones , Johnson);
		Project storeDavis = new Project("1", "Store Davis", "Store", "10 Main Road, Somerset West",
						"C01300140000012300000", "250000.00", "25000.00", "06/10/2022", Brown, Williams, Davis);
		
		// Manually set the objects created equal to Project array entries.
		projects[0] = apartmentSmith;
		projects[1] = houseJohnson;
		projects[2] = storeDavis;
		
		// Return the Project array.
		return projects;
	}
	
	// This method determines how many of the Project array entries defined above are not equal to null.
	// If the entry is not null, it means that a project has been defined. 
	// It counts the amount of projects.
	public static int numberOfCurrentProject(Project currentProjects [], int arraySize){
		// Initializes a variable to store the project number string, the total 
		// number of projects and the counter used to count the number of project
		// as the program loops through the array.
		String projectNumberString = "";
		int totalNumberOfProjects = 0;
		int countNumberOfProjects = 0;
		
		// Loops through the projects defined array. When the value for project
		// number is not equal to null for a specific entry, the count (countNumberOfProjects)
		// is indexed with 1.
		for (int i = 0; i < arraySize; i++){
			projectNumberString = currentProjects[i].getProjectNumber();
			if (projectNumberString != null){
				countNumberOfProjects++;
			}
		}
		
		// Set the totalNumberOfProjects equal to the latest value of countNumberOfProjects.
		totalNumberOfProjects = countNumberOfProjects;
		
		// Return the integer - totalNumberOfProjects to the class which calls
		// this method.
		return totalNumberOfProjects;
	}
	
	// This method displays all the options the user can select to execute certain actions. 
	// It also requests an input which is returned as an integer.
	public static int getUserChoice(){
		System.out.println("Choose one of the options below: ");
		System.out.println("");
		System.out.println("1. Create a new project.");
		System.out.println("2. Change the due date of an existing project.");
		System.out.println("3. Change the total amount paid to date");
		System.out.println("4. Update a contractor's contact details.");
		System.out.println("5. Finalise a project");
		System.out.println("6. Exit the program");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Please enter the number here: ");
		int userChoice = userInput.nextInt();
		userInput.nextLine();
		
		return userChoice;	
	}
	
	// This method requests input from the user to create a new project. The info requested from the user are the field values 
	// for the new Project object.
	public static Project addNewProject(Project currentProjects[], int arraySize){
		Scanner userInput = new Scanner(System.in);
		
		// Creates a project number String variable and requests the user to input the project number.
		System.out.println("Enter the project number: ");
		String userInputProjectNumber = userInput.nextLine();
		// Define a int variable which calls the 'isProjectNumberUnique' method to check if the user input a number that
		// already exists. The 'isProjectNumberUnique' returns 0 if the number entered by the user is not found in the projects array. 
		// If it is found a non-zero value is returned.
		int validProjectNumberCheck = methodsCont.isProjectNumberUnique(userInputProjectNumber, currentProjects, arraySize);
		
		// If the project number entered by the user already exists, a message is displayed and input is requested again. 
		// This input is then also checked against the existing project numbers. 
		// This code will be executed until the user enters a project number that is unique.
		while (validProjectNumberCheck != 0){
			System.out.println("Project number already exists, please enter another number: ");
			userInputProjectNumber = userInput.nextLine();
			validProjectNumberCheck = methodsCont.isProjectNumberUnique(userInputProjectNumber, currentProjects, arraySize);
		}
		
		// Defines a string for the project name user input and requests the user to enter a project name.
		System.out.println("Enter the project name: ");
		String userInputProjectName = userInput.nextLine();
		
		// Defines a string for the building type user input and requests the user to enter a building type.
		System.out.println("Enter the type of building to be designed: ");
		String userInputProjectType = userInput.nextLine();
		
		// Defines a string for the project physical user input and requests the user to enter a physical address.
		System.out.println("Enter the project physical address: ");
		String userInputProjectAddress = userInput.nextLine();
		
		// Defines a string for the ERF number user input and requests the user to enter an ERF number.
		System.out.println("Enter the project ERF number: ");
		String userInputProjectERF = userInput.nextLine();
		
		// Defines a string for the project price user input and requests the user to enter a project price.
		System.out.println("Enter the project price: ");
		String userInputProjectPrice = userInput.nextLine();
		
		// Defines a string for the total paid up to date user input and requests the user to enter the total paid.
		System.out.println("Enter the total amount paid to date: ");
		String userInputProjectPaid = userInput.nextLine();
		
		// Defines a string for the project deadline user input and requests the user to enter the project deadline.
		System.out.println("Enter the project deadline: ");
		String userInputProjectDeadlne = userInput.nextLine();
		
		// Defines String variables for all the Person object fields and request the user to input values for each.
		// Here the details for the project architect is requested. An architect is a Person object and a Project field.
		System.out.println("Enter the details of the project architect:");
		System.out.println("Name: ");
		String architectFirstName = userInput.nextLine();
		System.out.println("Surname: ");
		String architectSurname = userInput.nextLine();
		String architectName = architectFirstName+ " " + architectSurname;
		System.out.println("Telephone number: ");
		String architectNumber = userInput.nextLine();
		System.out.println("Email adress: ");
		String architectEmail = userInput.nextLine();
		System.out.println("Physical address: ");
		String architectAddress = userInput.nextLine();
		
		// Defines String variables for all the Person object fields and request the user to input values for each.
		// Here the details for the project contractor is requested. A contractor is a Person object and a Project field.
		System.out.println("Enter the details of the project contractor:");
		System.out.println("Name: ");
		String contractorFirstName = userInput.nextLine();
		System.out.println("Surname: ");
		String contractorSurname = userInput.nextLine();
		String contractorName = contractorFirstName + " " + contractorSurname;
		System.out.println("Telephone number: ");
		String contractorNumber = userInput.nextLine();
		System.out.println("Email adress: ");
		String contractorEmail = userInput.nextLine();
		System.out.println("Physical address: ");
		String contractorAddress = userInput.nextLine();
		
		// Defines String variables for all the Person object fields and request the user to input values for each.
		// Here the details for the project customer is requested. A customer is a Person object and a Project field.
		System.out.println("Enter the details of the project customer:");
		System.out.println("Name: ");
		String customerFirstName = userInput.nextLine();
		System.out.println("Surname: ");
		String customerSurname = userInput.nextLine();
		System.out.println("Telephone number: ");
		String customerNumber = userInput.nextLine();
		System.out.println("Email adress: ");
		String customerEmail = userInput.nextLine();
		System.out.println("Physical address: ");
		String customerAddress = userInput.nextLine();
		String customerName = customerFirstName + " " + customerSurname;
		
		// Defined the new Person objects by calling the constructor and entering the user input values as the constructor
		// parameters.
		Person newProjectArchitect = new Person(architectName, architectNumber, architectEmail, architectAddress);
		Person newProjectContractor = new Person(contractorName, contractorNumber, contractorEmail, contractorAddress);
		Person newProjectCustomer = new Person(customerName, customerNumber, customerEmail, customerAddress);
		
		// Define a variable which is equal to the length of the input string for the project name. 
		int lengthProjectName = userInputProjectName.length();
		
		// Checks if the length of the user input for project name is equal to zero. If it is, the user did not 
		// enter a project name and the project name is made of the building type and customer surname.
		if (lengthProjectName == 0){
			userInputProjectName =  userInputProjectType + " " + customerSurname ;
		}
		
		// Creates a new project object by calling the second constructor defined in the Project class file. 
		// The user values provided above are passed as the constructor parameters.
		Project newProject = new Project(userInputProjectNumber, userInputProjectName, userInputProjectType,
				userInputProjectAddress, userInputProjectERF, userInputProjectPrice, userInputProjectPaid,
				userInputProjectDeadlne, newProjectArchitect, newProjectContractor, newProjectCustomer);
		// Return the project created to the class that called the method.
		return newProject;
		}
	
	// Method loops through the current projects array and checks if the project number entered by the user is equal to a given 
	// array entry project number. If so, the the setDueDate method is called to change the Deadline field for the specific project 
	// number.
	public static void changeDeadline(Project currentProjectsDefined [], int numberOfProjects){
		Scanner userInput = new Scanner(System.in);
		
		// Initializes the return value.
		Project projectToPrint = null;
		
		// Request the user to input the project number that needs to be edited.
		System.out.println("");
		System.out.println("Please enter the project number: ");
		int projectNumberToEdit = userInput.nextInt();
		userInput.nextLine();
		System.out.println("");
		
		// Loop through the project array.
		for (int j = 0; j < numberOfProjects; j++){
			// Convert the String project number to an integer.
			String currentNumber =currentProjectsDefined[j].getProjectNumber();
			int isThisTheNumber = Integer.parseInt(currentNumber);
			
			// Check if the project number is equal to the number the user entered.
			if (isThisTheNumber == projectNumberToEdit){
				// If the project numbers match, display the current deadline by calling the getProjectDeadline method.
				System.out.println("The current project deadline is: ");
				System.out.println(currentProjectsDefined[j].getProjectDeadline());
				System.out.println("");
				
				// Request the user to input the new project deadline.
				System.out.println("Please enter the new due date: ");
				String newDueDate = userInput.nextLine();
				// Set the object field equal to the new deadline by calling the setDueDate method.
				currentProjectsDefined[j].setDueDate(newDueDate);
				System.out.println("");
				
				// Update the return value and print the updates project details.
				projectToPrint = currentProjectsDefined[j];
				System.out.println("Updated Project Details ");
				System.out.println("");
				System.out.println(projectToPrint);
			}
			
		}
		
	}
	
	// Method does the same as the changeDeadline method, except it allows the user to change the totalPaid field instead of the 
	// deadline.
	public static Project changeTotalPaid(Project currentProjects [], int numberOfProjects){
		Scanner userInput = new Scanner(System.in);
		Project projectToPrint = null;
		
		System.out.println("");
		System.out.println("Please enter the project number: ");
		int projectNumberToEdit = userInput.nextInt();
		userInput.nextLine();
		System.out.println("");
		
		for (int j = 0; j < numberOfProjects; j++){
			String currentNumber = currentProjects[j].getProjectNumber();
			int isThisTheNumber = Integer.parseInt(currentNumber);
			
			if (isThisTheNumber == projectNumberToEdit){
				System.out.println("The original fee paid to date is: ");
				System.out.println(currentProjects[j].getProjectTotalPaid());
				System.out.println("");
				System.out.println("Please enter the updated total paid to date: ");
				String newTotalPaid = userInput.nextLine();
				
				currentProjects[j].setTotalPaid(newTotalPaid);
				
				projectToPrint = currentProjects[j];
				System.out.println("");
				System.out.println("Updated Project Details ");
				System.out.println("");
				System.out.println(projectToPrint);
				
			}
			
		}
		
		return projectToPrint;
	}
	
	// Method does the same as the changeDeadline method, except it allows the user to change the contractor field instead of the 
	// deadline. It is a bit different than the two methods above in the sense that a Person object is modified instead of a Project
	// object. Because the Person object is passed to the Project object as a field, the Project is automatically updated.
	public static void changeContractorDetails(Project currentProjects [], int numberOfProjects){
		Scanner userInput = new Scanner(System.in);
		// Initialize the return Person object.
		Person contractorToEdit = null;
		
		// Request the user to enter the project number, for which they want to update the contactor's details.
		System.out.println("");
		System.out.println("Please enter the project number: ");
		int projectNumberToEdit = userInput.nextInt();
		userInput.nextLine();
		
		// Loop through all the projects and look for the project with the same project number as the value entered by 
		// the user.
		for (int j = 0; j < numberOfProjects; j++){
			String currentNumber = currentProjects[j].getProjectNumber();
			int isThisTheNumber = Integer.parseInt(currentNumber);
			
			// If the project is found, display the current details of the contractor by calling the getProjectContractor method.
			if (isThisTheNumber == projectNumberToEdit){
				System.out.println("");
				System.out.println("Contractor's details ");
				contractorToEdit = currentProjects[j].getProjectContractor();
				System.out.println(contractorToEdit);
				
				// Display the options of details that the user can edit.
				System.out.println("");
				System.out.println("The following can be updated:");
				System.out.println("1. Telephone Number");
				System.out.println("2. Email Address");
				System.out.println("3. Physical Address");
				
				// Request the user to select an option.
				System.out.println("");
				System.out.println("Please enter the number of the details you want to update here: ");
				int contractorDetailType = userInput.nextInt();
				userInput.nextLine();
				
				// Change the values of the person fields based on which option the user selects.
				// If the user selects to change the contractor's telephone number, call the .setPersonNumber method to change
				// the field value. .setPersonEmail is used to change the Email field value and .setPersonAddress is used to 
				// change the physical address field value.
				if (contractorDetailType == 1){
					System.out.println("");
					System.out.println("Please enter the updated telephone number: ");
					String newTelephoneNumber = userInput.nextLine();
					contractorToEdit.setPersonNumber(newTelephoneNumber);
				}else if(contractorDetailType == 2){
					System.out.println("");
					System.out.println("Please enter the updated email address: ");
					String newEmailAddress = userInput.nextLine();
					contractorToEdit.setPersonEmail(newEmailAddress);
				}else if(contractorDetailType == 3){
					System.out.println("");
					System.out.println("Please enter the updated physical address: ");
					String newPhysicalAddress = userInput.nextLine();
					contractorToEdit.setPersonAddress(newPhysicalAddress);
				}else{
					System.out.println("Invalid selection");
				}
				// Print out the updated details of the contractor.
				System.out.println("");
				System.out.println("Updated Details  ");
				System.out.println(currentProjects[j].getProjectContractor());
				System.out.println("");
			}
		}

	}
}

