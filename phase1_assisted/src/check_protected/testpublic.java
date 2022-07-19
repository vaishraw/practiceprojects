package check_protected;
import access_modifiers.public_class;

public class testpublic {
	public static void main(String[] args) {
		System.out.println("test public access specifier");
		public_class obj=new public_class();
		obj.display();
	}

}
