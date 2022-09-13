
public class callmethod {
	int x=100;
	int calculation(int x) {
		x=x/2;
		return x;
		
	}
	public static void main(String[] args) {
		callmethod c=new callmethod();
		System.out.println("before calling method: "+c.x);
		c.calculation(200);
		System.out.println("after calling method: "+c.x);
	}

}
