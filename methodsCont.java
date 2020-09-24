import java.util.Scanner;

// methodsCont has the same purpose as the methods file. It is included to reduce the size of the methods file.
public class methodsCont {
	
	//  Method writes a Project to a completed Project array. It also displays an invoice if the account
	// has not been paid in full.
	public static Project finalizeProject(Project currentProjects[], int numberOfProjects){
		Scanner userInput = new Scanner(System.in);
		// Request the user to input the project number that has to be finalized.
		System.out.println("");
		System.out.println("Enter the project number to finalize: ");
		int projectNumberToFinalize = userInput.nextInt();
		userInput.nextLine();
		System.out.println("");
		// Initialize the return value Project object.
		Project newCompletedProject = null;
		// Initialize the value use to calculate how much is still left to be paid.
		double totalToPay = 0;
	
		// Loops through the projects and looks for the project that has the same project number as the one entered by the
		// user.
		for (int j = 0; j < numberOfProjects; j++){
			
			String currentNumber = currentProjects[j].getProjectNumber();
			int isThisTheNumber = Integer.parseInt(currentNumber);

			// If the project to edit is found, set the project status (field) equal to 'completed' and request the user to 
			// enter the completion date.
			if(isThisTheNumber == projectNumberToFinalize){
				String projectStatus = "Completed";
				System.out.println("Please enter the completion date: ");
				String completionDate = userInput.nextLine();
				System.out.println("");
				
				// Obtain the project number, name, price and total paid to date.
				String completedProjectNumber = currentProjects[j].getProjectNumber();
				String completedProjectName = currentProjects[j].getProjectName();
				double totalFeePayable = Double.parseDouble(currentProjects[j].getProjectFee());
				double totalPaid = Double.parseDouble(currentProjects[j].getProjectTotalPaid());
				
				// Check if the total paid is less than the total payable. If true, an invoice needs to be generated for the 
				// remaining amount. The remaining amount is calculated by subtracting the total paid from the total payable.
				if(totalPaid  < totalFeePayable){
					totalToPay = totalFeePayable - totalPaid;
					
					// Print out the invoice is an easy to read format. It prints the customer details and the amount payable.
					System.out.println("*****************************************************");
					System.out.println("\t\t\tINVOICE");
					System.out.println("");
					System.out.println("Customer: ");
					System.out.println(currentProjects[j].getProjectCustomer());
					System.out.println("");
					System.out.println("Amount payable: R" + totalPaid);
					
					System.out.println("*****************************************************");
				}
				// A new project is created from the original project. This project is then written to the completed projects array. 
				// The third constructor is called in the Project class file.
				newCompletedProject = new Project(completedProjectNumber, completedProjectName, projectStatus, completionDate);
				
			}		
			
		}
		// Return the completed Project object.
		return newCompletedProject;	
	}
	
	// Method to print a summary of all the completed projects. 
	public static String printCompletedProjects(Project completedProjects [], int arraySize){
		// Calls the 'numberOfCurrectProjects' method to determine how many completed projects have been defined in the 
		// completed projects array.
		int numberOfCompletedProjects = methods.numberOfCurrentProject(completedProjects, arraySize);
		// Initializes the display string.
		String completedSummaryStringDisplay = "";
		
		// Loops through the completed projects array and prints out the project name, number and completion date.
		for (int j = 0; j <numberOfCompletedProjects; j++){
		String completedSummaryString =	"Name: " + completedProjects[j].getProjectName() + ", Number: " + 
		completedProjects[j].getProjectNumber() + ", Completion Date: " + completedProjects[j].getProjectCompletionDate();
		completedSummaryStringDisplay += completedSummaryString + "\n";
		}
		// Returns the display string.
		return completedSummaryStringDisplay;
	}
	
	// Method compares the user input for the a new project number with existing project numbers. 
	// If the project number already exists, the user is requested to use another number to avoid duplication. 
	// There cannot be duplication as the whole Posied program runs on the logic that the project numbers are unique,
	public static int isProjectNumberUnique(String userDefinedProjectNumber, Project currentProjects[], int arraySize){
		// Converts the String value entered by the user to an Integer.
		int userDefinedProjectNumberInt = Integer.parseInt(userDefinedProjectNumber);
		
		// Calls the numberOfCurrentProject method to determine the amount of already defined projects.
		int numberOfProject = methods.numberOfCurrentProject(currentProjects, arraySize);
		//System.out.println("Number of projects: " + numberOfProject);
		int count = 0;
		
		// Loops through the existing projects to check if the number entered by the user is found. If it is, the count variable
		// is indexed. If the count variable is not zero, it means that the number already exists.
		for(int j=0; j < numberOfProject; j++){
			String currentNumber = currentProjects[j].getProjectNumber();
			int currentNumberInt = Integer.parseInt(currentNumber);
			if(userDefinedProjectNumberInt == currentNumberInt){
				count ++;
			}
			
		}
		// Returns the integer count value.
		return count;
		
	}
	
}
