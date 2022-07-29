import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class operations {
	static Set<String> obj2;
	static Set<String> obj;

	public static void optionSelection() {
		obj2 = new TreeSet<String>();
		obj = new TreeSet<String>();
		obj.add("abc.txt");
		obj.add("xyz.txt");
		obj.add("pqr.docx");
		obj2.add("def.pdf");
		obj2.add("tuv.pdf");
		obj.addAll(obj2);
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			Menu.DisplayMainMenu();
			System.out.println("Enter your choice.");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("All Files in the folder: ");
				System.out.println(obj);
				break;
			case 2:
				System.out.println("File Operations Menu: ");
				operations.FileMenuOperations();
				break;
			case 3:
				System.out.println("Application Exited Successfully.");
				sc.close();
				break;
			default:
				System.out.println("Enter Valid Choice.");

			}
		} while (ch != 3);

	}

	private static void FileMenuOperations() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			Menu.DisplayFileMenu();
			System.out.println("Enter Your Choice.");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the name of File to be Added: ");
				String fadd = sc.next();
				obj2.add(fadd);
				obj.addAll(obj2);
				System.out.println("File Added Successfully");
				System.out.println(obj);
				break;
			case 2:
				System.out.println("Enter the name of file you want to delete: ");
				String fdel = sc.next();
				if (obj.contains(new String(fdel))) {
					obj.remove(new String(fdel));
					System.out.println("File Deleted Successfully");
					System.out.println(obj);
				} else {
					System.out.println("Entered file do not Exist");
				}
				break;
			case 3:
				System.out.println("Enter the Name of File you want to Search: ");
				String fsearch = sc.next();
				if (obj.contains(new String(fsearch))) {
					System.out.println(fsearch + " file found Successfully.");
				} else {
					System.out.println(fsearch + " file not found.");
				}
				break;
			case 4:
				System.out.println("Return TO Main Menu:");
				//operations.optionSelection();
				return;
				
			case 5:
				System.out.println("Application Exited Successfully.");
				sc.close();
				System.exit(0);
			
			default:
				System.out.println("Enter Valid Choice.");
			}

		} while (ch != 5);
	}
}