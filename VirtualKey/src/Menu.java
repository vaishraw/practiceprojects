
public class Menu {

	public static void printWlcmScreen(String AppName, String DevName) {
		String compinfo = String.format("\n*****************************************************************"
				+ "\n**Welcome To %s.com And Developed By %s**" + "\n*****************************************************************", AppName,
				DevName);
		String appfun = ("This Application provides following features:\n" + "1. Retrieve all File Names\n"
				+ "2. Search/Add/Delete the Files\n");
		System.out.println(compinfo);
		System.out.println(appfun);
	}

	public static void DisplayMainMenu() {
		String mainmenu = ("\n\n****Welcome To Main Menu****\n" + "1. Retrieve All Files in Ascending Order\n"
				+ "2. Display File Operations Menu\n" + "3. Exit the Application\n");
		System.out.println(mainmenu);

	}

	public static void DisplayFileMenu() {
		String fmenu = ("\n\n***Welcome To File Menu Operations****\n" + "1. Add a New File\n"
				+ "2. Delete the Existing File\n" + "3. Search the File\n" + "4. Show Previous Menu\n"
				+ "5.Exit the Application\n");
		System.out.println(fmenu);
	}
}
