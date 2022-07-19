
public class defaultconstructor {
	int id;
	String name;
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		defaultconstructor obj=new defaultconstructor();
		obj.display();
	}

}
