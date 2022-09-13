package sleep_wait;

public class class2  {
	public static void main(String[] args) throws InterruptedException {
		class2 obj=new class2();
		Thread.sleep(1000);
		System.out.println("thread "+Thread.currentThread().getName()+" has woken up after sleeping for 1 second");
		synchronized(obj)
		{
			obj.wait(1000);
			System.out.println("thread "+obj+" has woken up after waiting for 1 second");
		}
		
	}
	
	

}
