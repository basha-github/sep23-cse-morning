
public class BankAccount {
	
	private int accNo;
	private String name;
	private int balance;
	
	public BankAccount(int accNo, String name,
			int balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		
		System.out.println(this.accNo + " Account got created "
				+ "on name "+this.name+ " with Openning "
						+ "Balance "+this.balance);
	}

	
	
	void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("successfully deposited amount..."+amt);
		
	}
	
	void withDraw(int amt) {
		
		this.balance = this.balance - amt;
		System.out.println("successfully withdrawn "
				+ "amount..."+amt);
		
	}
	
	void checkBalance() {
		System.out.println("Available Balance..."+this.balance);
	}
	
	
	
	

}
