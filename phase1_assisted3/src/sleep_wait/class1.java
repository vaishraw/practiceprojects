package sleep_wait;

public class class1 implements Runnable {
    int sum;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tname=Thread.currentThread().getName();
		System.out.println(tname+" : Calculation Begins" );
		for(int i=1;i<=5;i++) {
			sum += i;
		}
		System.out.println(tname+" : calculation Ends");
	}
	

}
