package lab3q3;

public class BankCustomer {

	
	private String Name;
	private String Address;
	private float savings1;
	private float savings2;
	private float savings3;
	
	//constructor method
	public BankCustomer(String name, String address) {
		setCustomerName(name);
		setCustomerAddress(address);
	}
	
	public void setCustomerName(String name)
	{
		setCustomerName = name;		
	}

	public String getcustomerName()
	{
		return customerName;
	}
	
	public void setCustomerAddress(String address)
	{
		setCustomerAddress = address;		
	}

	public String getCustomerAddress()
	{
		return customerAddress;
	}
	

}
