
public class implicit_explicit {
	public static void main(String[] args) {
		int i=67;
		//explicit casting
		char c=(char) i;
		System.out.println("before explicit casting: "+i);
		System.out.println("after explicit casting: "+c);
		
		char x='Z';
		//implicit casting
		int u= x;
		System.out.println("before implicit casting: "+x);
		System.out.println("after implicit casting: "+u);
		}

}
