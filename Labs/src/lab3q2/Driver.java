package lab3q2;

public class Driver {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
			
		saver1.setSavingsBalance(2000.00f);
		saver2.setSavingsBalance(3000.00f);
		
		
		SavingsAccount.setAnnualIntrestRate(0.04f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		
		SavingsAccount.setAnnualIntrestRate(0.05f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		
		
		
		
	
	
	}
}
