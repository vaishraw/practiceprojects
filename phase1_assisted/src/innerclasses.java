
public class innerclasses {
	private String msg="this is the outer class";
	class inner{
		void call() {
			System.out.println(msg+" inside inner class call()");
		}
	}
	public static void main(String[] args) {
		innerclasses obj=new innerclasses();
		innerclasses.inner obj1=obj.new inner();
		obj1.call();
	}

}
