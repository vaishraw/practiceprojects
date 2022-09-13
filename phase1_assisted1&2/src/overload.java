
public class overload {
	void area(int b,int h) {
		System.out.println("area of triangle: "+(0.5*b*h));
	}
	void area(int r) {
		System.out.println("area of circle: "+(3.14*r*r));
	}
	public static void main(String[] args) {
		overload obj=new overload();
		obj.area(20, 4);
		obj.area(2);
	}

}
