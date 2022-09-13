package threadcreation;

public class threadrun implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		String tname=Thread.currentThread().getName();
		System.out.println(tname+" : Main Method Begins");
		threadrun tr=new threadrun();
		Thread t=new Thread(tr);
		t.setName("t");
		t.start();
        for(int i=1;i<=5;i++) {
        	System.out.println(tname+" : "+i);
        	Thread.sleep(1000);
        }
        System.out.println(tname+" : Main Method Ends");

}
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
