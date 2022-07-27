package sync;

public class threadedsend extends Thread {
	private String msg;
	private Thread t;
	sender s1;
	threadedsend(String m,sender obj){
		this.msg=m;
		s1=obj;
	}
	public void run(){
		synchronized(s1){
			s1.send(msg);
		}
		
	}

}
