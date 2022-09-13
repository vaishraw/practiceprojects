package threadcreation;

public class threadextend extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String tname=Thread.currentThread().getName();
		System.out.println(tname+" : Main Method Begins");
		threadextend t1=new threadextend();
		t1.setName("t1");
		t1.start();
		for(int i=1;i<=5;i++) {
		System.out.println(tname+" : "+i);
		Thread.sleep(1000);
		}
		System.out.println(tname+" : Main Method Ends");

	}
	public void run() {
		String tname=Thread.currentThread().getName();
		for(int i=1;i<=5;i++) {
		System.out.println(tname+" : "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
