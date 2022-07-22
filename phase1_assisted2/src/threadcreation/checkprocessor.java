package threadcreation;

public class checkprocessor implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tname=Thread.currentThread().getName();
		System.out.println(tname+" : processed the check");
		
	}

}
