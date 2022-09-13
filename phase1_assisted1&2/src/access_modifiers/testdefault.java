package access_modifiers;

public class testdefault {
	public static void main(String[] args) {
		System.out.println("testing default access specifier");
		default_class obj=new default_class();
		obj.display();
		
		/*System.out.println("testing private access specifier");
		private_class obj=new private_class();*/
		//obj.display() 
		//not able to find as display method is private.
		
		System.out.println("testing protected access specifier");
		protected_class obj1=new protected_class();
		obj1.display();
		
	}

}
