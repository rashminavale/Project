package Phase1Project;

import java.util.List;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create "main" folder if not present in current folder structure
				FileOperations.CreateMainFolderIfNotPresent("main");
				//FileOperations.DisplayAllFiles(String);
				
				//FileOperations.CreateFile(String FileToAdd,Scanner sc);
				//FileOperations.List<String> displayFileLocations(String fileName, String path);
				//FileOperations.deleteFileRecursively(String path) ;
		
		
				MenuOptions.printWelcomeScreen("LockedMe", "Rashmi Navale");
				//MenuOptions.DisplayMenu();
				//MenuOptions.displayFileMenuOptions();
				
				
				HandleOptions.HandleWelcomeScreenInput();
				//HandleOptions.HandleFileMenuOptions();

	}

}
