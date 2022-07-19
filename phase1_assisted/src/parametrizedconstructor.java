
public class parametrizedconstructor {
	int i;
	String x;
	parametrizedconstructor(int id,String name){
		this.i=id;
		this.x=name;
	}
	void display()
	{
		System.out.println(i+" "+x);
	}
	public static void main(String[] args) {
		parametrizedconstructor n1=new parametrizedconstructor(1001, "SAM");
		parametrizedconstructor n2=new parametrizedconstructor(1002,"MAX");
		n1.display();
		n2.display();
		
	}

}
