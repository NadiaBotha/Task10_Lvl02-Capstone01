import java.util.Scanner;

// Define the main method. This file needs to be executed as the user.
public class Poised {
	public static void main(String[] args){
	
		// Define an integer for the array size and set it equal to 100. A larger number can also be used. 
		// The lower the number, the quicker the array will be at full capacity. This means this program can only store 100
		// projects for one execution.
		int sizeArray = 100;
		
		Scanner userInput = new Scanner(System.in);

		// Create a new array which has the size of the sizeArray variable. This array is used to store all the persons
		Person currentPersons[] = methods.createPerson(sizeArray);
		
		// Create a new array by calling the createProjec method. The currentProjects array is used to store all the projects.
		Project currentProjects[] = methods.createProject(currentPersons[0], currentPersons[1], currentPersons[2], currentPersons[3], 
				currentPersons[4], currentPersons[5], currentPersons[6], sizeArray);
		// Create a new array which has the size of the sizeArray variable. This array is used to store all the completed projects.
		Project completedProjects[] = methods.createCompletedNullArray(sizeArray);
		
		// Call the numnerOfCurrentProject method to determine the amount of projects already defined. This variable is updated
		// as new projects are created. 
		int numberOfCurrentProjects = methods.numberOfCurrentProject(currentProjects, sizeArray);	
		// Same as the variable above, except it determined the amount of completed projects instead of existing projects.
		int numberOfCompletedProjects = methods.numberOfCurrentProject(completedProjects, sizeArray);
		//System.out.println(numberOfCurrentProjects);
		
		// Calls the getUserChoice method to display options to the user on what actions can be executed. It also requests input
		// from the user and returns the integer value.
		int userChoice = methods.getUserChoice();
		
		// As long as the user selects an option smaller than 6, the while loop is executed. 
		while (userChoice < 6){
			
			// If the user chooses option 1, a new project is created and added to the currentProject array.
			// The numberOfCurrentProjects variable is indexed to account for the new project.
			// Most of the code is executed and explained in the addNewProject method. The Project object returned by this method
			// is appended to the currentProjects array in this if statement.
			if(userChoice == 1){
							
				currentProjects[numberOfCurrentProjects] = methods.addNewProject(currentProjects, sizeArray);
				System.out.println("");
				System.out.println("Project details \n");
				System.out.println(currentProjects[numberOfCurrentProjects]);
				System.out.println("");
				numberOfCurrentProjects++;
				
				// After the above has been executed the getUserChoice is called to enable the user to select another choice. 
				// Depending on what the user selects, the while loop will be executed.
				userChoice = methods.getUserChoice();
			}
			// If the user chooses option 2, the a project deadline can be edited. 
			// Most of the code is executed and explained in the changeDeadline method.
			if(userChoice == 2){
 				methods.changeDeadline(currentProjects, numberOfCurrentProjects);
				System.out.println("");
				
				// After the above has been executed the getUserChoice is called to enable the user to select another choice. 
				// Depending on what the user selects, the while loop will be executed.
				userChoice = methods.getUserChoice();
			}
			
			// If the user chooses option 3, the total paid value for a specific project can be updated.
			// Most of the code is executed and explained in the changeTotalPaid method.
			if(userChoice == 3){
				methods.changeTotalPaid(currentProjects, numberOfCurrentProjects);
				System.out.println("");
				
				// After the above has been executed the getUserChoice is called to enable the user to select another choice. 
				// Depending on what the user selects, the while loop will be executed.
				userChoice = methods.getUserChoice();
			}
			
			// If the user chooses option 4, the contractor's contact details can be edited. 
			// The code is executed and explained in the changeContractorDetails method.
			if(userChoice == 4){
				methods.changeContractorDetails(currentProjects,numberOfCurrentProjects);
				
				// After the above has been executed the getUserChoice is called to enable the user to select another choice. 
				// Depending on what the user selects, the while loop will be executed.
				userChoice = methods.getUserChoice();
			}
			
			// If the user chooses option 5, the project is finalized. It is placed in the completed projects array, an invoice is
			// displayed if there is still an outstanding amount on the account and a summary is displayed.
			if(userChoice == 5){
				completedProjects[numberOfCompletedProjects] = methodsCont.finalizeProject(currentProjects, numberOfCurrentProjects);
				
				// Displays a basic summary of the project that the user has selected to finalize. 
				System.out.println("Summary of project finalized ");
				System.out.println("");
				System.out.println("Project Name: " + completedProjects[numberOfCompletedProjects].getProjectName());
				System.out.println("Project Number: " + completedProjects[numberOfCompletedProjects].getProjectNumber());
				System.out.println("Project Status: " + completedProjects[numberOfCompletedProjects].getProjectStatus());
				System.out.println("Project Completion Date: " + completedProjects[numberOfCompletedProjects].getProjectCompletionDate());
				
				// The project is added to the completed projects array and the numberOfCompletedProjects is indexed.
				numberOfCompletedProjects++;
				
				// Call the printCompltedProjects method to display a quick summary of all the projects that have been finalized. 
				// Once the program is executed again, all the data is lost. Typically this data will also be written to a text file.
				String displaySummary = methodsCont.printCompletedProjects(completedProjects, sizeArray);
				System.out.println("");
				System.out.println("Summary of all completed projects");
				System.out.println(displaySummary);
				//System.out.println("");
				
				// After the above has been executed the getUserChoice is called to enable the user to select another choice. 
				// Depending on what the user selects, the while loop will be executed.
				userChoice = methods.getUserChoice();
			}
		}
		// If the user chooses option 6, the string below is printed.
		if(userChoice == 6){
				System.out.println("Exiting the program...");
		}
		// If the user chooses any other options, an error message is displayed.
		if(userChoice > 6){
				System.out.println("");
				System.out.println("Invalid choice, please select another choice.");
				System.out.println("");
			
		}
		
		userInput.close();
	}
		
		
}


