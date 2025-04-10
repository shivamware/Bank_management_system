
public class Account abstract Bank_management_system{
	
	private long acNumber;
	private String acHolderName;
	private double balance;
	
	public Account () {
		
	}
	
	
	public Account(long acNumber, String acHolderName, double balance) {
		super();
		this.acNumber = acNumber;
		this.acHolderName = acHolderName;
		this.balance = balance;
	}
	
	public long getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(long acNumber) {
		this.acNumber = acNumber;
	}

	public String getAcHolderName() {
		return acHolderName;
	}

	public void setAcHolderName(String acHolderName) {
		this.acHolderName = acHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Deposit(amount) {
		balance=balance+amount;
		System.out.println("Deposit amount:"+amount+"After deposit balance is:"+balance);
	}
	
	public void withdraw(amount) {
		balance=balance-amount;
		System.out.println("Withdraw amount:"+amount+"After withdraw balance is:"+balance);
	}

	 public abstract double calculateInterest();
}
