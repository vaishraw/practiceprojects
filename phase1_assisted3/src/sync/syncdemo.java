package sync;

public class syncdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sender snd=new sender();
		threadedsend s1=new threadedsend("Hi", snd);
		threadedsend s2=new threadedsend("Bye",snd);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("interruptd");
		}
		

	}

}
