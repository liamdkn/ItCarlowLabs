package lab3q2;

public class SavingsAccount {

	private int accountNumber;
	private static float annualIntrestRate;
	private float savingsBalance;
	
	private static int nextFreeAccountNumber = 1;
	
	public SavingsAccount() {
		accountNumber = nextFreeAccountNumber;
		nextFreeAccountNumber++;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void calculateMonthlyInterest() {
		float interest = savingsBalance * annualIntrestRate / 12;
		savingsBalance = savingsBalance + interest;
	}

	public static float getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public static void setAnnualIntrestRate(float annualIntrestRate) {
		SavingsAccount.annualIntrestRate = annualIntrestRate;
	}

	public float getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	

	
	public String toString() {
		return "Savings Balance " +getSavingsBalance();
	}


	
	
	
}
