package sync;

public class sender {
	public void send(String msg) {
		System.out.println("Sending\t "+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Thread Interrupted.");
		}
		System.out.println("\n"+msg+" sent");
	}

}

