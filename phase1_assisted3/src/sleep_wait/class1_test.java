package sleep_wait;

public class class1_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String tname=Thread.currentThread().getName();
		System.out.println(tname+" : Main Method Begins");
		class1 c1=new class1();
		Thread t=new Thread(c1);
		t.setName("t");
		t.start();
		System.out.println(tname+" : Waiting");
		/*synchronized(t) {
		t.wait();*/
		t.join();
		System.out.println(tname+" Sum : "+c1.sum);
		System.out.println(tname+" : Main Method Ends");
		}
	//}

}
