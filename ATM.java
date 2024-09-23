
public class ATM {

	public static void main(String[] args) {
	
		BankAccount ramuAcc = new BankAccount(10056,"Ramu",
				5000);
		BankAccount ShyamAcc = new BankAccount(10054,"Shyam",
				15000);
		BankAccount RadhaAcc = new BankAccount(10059,"Radha",
				50000);
		
		
		ShyamAcc.checkBalance();
		
		ShyamAcc.deposit(12500);
		ShyamAcc.checkBalance();
		
		ShyamAcc.withDraw(3500);
		ShyamAcc.checkBalance();
	}

}
