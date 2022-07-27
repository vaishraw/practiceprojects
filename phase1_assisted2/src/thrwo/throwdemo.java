package thrwo;

public class throwdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwdemo obj = new throwdemo();
		try {
			int withDrawAmount = 5000;
			System.out.println("Withdrawing: " + withDrawAmount);
			obj.WithdrawFromATM(withDrawAmount, 4538);
			System.out.println("Amount Withdrawn");
		} catch (RuntimeException ex) {
			System.out.println("Exception Occurred. " + ex.getMessage());
		}
	}

	
	void WithdrawFromATM(int withdrawamt,int accountnumber ) {
		int balance=getbalancefromaccount(accountnumber);
		if(withdrawamt>balance) {
			throw new RuntimeException("Division by Zero");
		}
	}
	private int getbalancefromaccount(int accountnumber) {
		// TODO Auto-generated method stub
		return 1000;
	}

}
