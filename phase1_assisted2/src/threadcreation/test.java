package threadcreation;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String tname=Thread.currentThread().getName();
		System.out.println(tname+" : Main Method Begins");
		checkprocessor cp=new checkprocessor();
		Thread t=new Thread(cp);
		t.setName("t1");
		t.start();
		t.join();
		System.out.println(tname+" : Main Method Ends");

	}

}
