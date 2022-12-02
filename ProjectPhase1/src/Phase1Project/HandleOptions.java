package Phase1Project;

import java.util.List;
import java.util.Scanner;

class HandleOptions extends MainRunner {

	 public static void HandleWelcomeScreenInput()
	 {
		 boolean running = true;
		 Scanner sc = new Scanner(System.in);
		 do {
			 try {
				 MenuOptions.DisplayMenu();
				 int input = sc.nextInt();
				 
				 switch(input)
				 {
				 case 1: 
					 FileOperations.DisplayAllFiles("main");
					 break;
				 case 2:
					 HandleOptions.HandleFileMenuOptions();
					 break;
				 case 3:
					 System.out.println("Program existed ");
					 running = false;
					 sc.close();
					 System.exit(0);
					 break;
				default:
					System.out.println("Please Select Valid Option ");
				 }
			 }catch(Exception e)
			 	{
				 System.out.println(e.getClass().getName());
				 HandleWelcomeScreenInput();
			 	}
		 	}
		 while(running == true);
	}



public static void HandleFileMenuOptions()
{
	boolean running = true;
	Scanner sc = new Scanner(System.in);
	
	do
	{
		try {
			MenuOptions.displayFileMenuOptions();
			FileOperations.CreateMainFolderIfNotPresent("main");
			
			int input = sc.nextInt();
			
			switch(input)
			{
				case  1:
					//Add File
					
					System.out.println("Enter name of file to be added in main folder ");
					String FileToAdd = sc.next();
					FileOperations.CreateFile(FileToAdd, sc);
					break;
				
				case 2: 
					// File/Folder Delete Operation
					
					System.out.println("Enter name of file to be deleted: ");
					
					String FiletoDelete = sc.next();
					FileOperations.CreateMainFolderIfNotPresent("main");
					
					List<String> FilesToDelete = 
							FileOperations.displayFileLocations(FiletoDelete,"main");
					
					String DeletionPrompt = "\n Select index of file to be deleted: "
											+ "\n (*Enter 0 if you want to delete all elements)";
					
					System.out.println(DeletionPrompt);
					
					int index = sc.nextInt();
					
					if(index!=0)
					{
						FileOperations.deleteFileRecursively(FilesToDelete.get(index-1));
						
					}
					else
					{
						//if index ==0 delete all files
						
						for(String path: FilesToDelete)
						{
							FileOperations.deleteFileRecursively(path);
						}
					}
					break;
				
				case 3:
					//Search file/folder
					
					System.out.println("Enter name of file you wanna search  ");
					String FileName = sc.next();
					
					FileOperations.CreateMainFolderIfNotPresent("main");
					
					FileOperations.displayFileLocations(FileName,"main");
					
					break;
					
				case 4: 
					//goto previous menu
					return;
					
				case 5:
					//Exit
					System.out.println("Program Exited Successfully");
					running=false;
					sc.close();
					System.exit(0);
					
				default:
					System.out.println("Select valid options0");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
			HandleFileMenuOptions();
		}
	}while(running==true);
	
}
}

