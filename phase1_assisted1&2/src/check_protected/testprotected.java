package check_protected;

import access_modifiers.protected_class;



public class testprotected extends protected_class {
	public static void main(String[] args) {
		System.out.println("test protected in another package");
		testprotected obj=new testprotected();
		obj.display();
	}

}
