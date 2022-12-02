
package Phase1Project;

/**
 * @author Rashmi Navale
 *
 */
 class MenuOptions extends MainRunner {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

	public static void printWelcomeScreen(String ApplicationName, String DeveloperName) {
		// TODO Auto-generated method stub
		String CompanyDetails = String.format("*************\n"+"Application Name is %s.com \n"+"Application developed by %s \n"+"************* \n",ApplicationName,DeveloperName);
		
		String AppFunction = String.format("Main features of Apllications are: \n" +"   1. Retrieve all files in \"main\" folder \n"+"   2. Search , add, delete files \"main\" folder");
		
		System.out.println(CompanyDetails);
		System.out.println(AppFunction);
		
		
	}

	public static void DisplayMenu()
	{
		String Menu = "\n***** Select \"option\" you want to perform:  ****  \n" 
				+ "   1] Retrieve all files in \"main\" folder \n "
				+ "  2] Display menu for File operations\n"
				+ "   3] Exit Operation \n";
		
		System.out.println(Menu);
	}
	
	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n******  Select \"option\" you want to perform and press Enter:  ******\n\n"
				+ " 1]  Add a file to \"main\" folder\n" + " 2]  Delete a file from \"main\" folder\n"
				+ " 3]  Search for a file from \"main\" folder\n" + " 4]  Show Previous Menu\n" + " 5]  Exit program\n";

		System.out.println(fileMenu);
}

}
