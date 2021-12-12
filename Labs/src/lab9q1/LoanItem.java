package lab9q1;

public interface LoanItem {
	
	private int daysLoaned;
	private int CDppd = 0.15;
	private int Bookppd = 0.10;

	public int calculatePrice();
	
	return (daysloaned * CDppd) + (daysLoaned * Bookppd);
}
