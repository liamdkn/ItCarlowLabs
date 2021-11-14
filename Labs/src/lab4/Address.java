package lab4;

public class Address {
	
	private String streetName;
	private String town;
	private String county;
	private int postcode;
	
	
	public String getStreetName()
	{
		return streetName;
	}
	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}
	
	public String getTown()
	{
		return town;
	}
	public void setTown(String town)
	{
		this.town = town;
	}
	
	public String getCounty() 
	{
		return county;
	}
	
	public void setCounty(String county) 
	{
		this.county = county;
	}
	
	public int getPostcode()
	{
		return postcode;
	}
	public void setPostcode(int postcode)
	{
		this.postcode = postcode;
	}
	
	public String toString()//compile all into a string breaking the line inbetween address parts
	{
		return "\n" + getStreetName() + "\n" + getTown() + "\n" + getCounty()+ "\n" + getPostcode();		
	}
}
	
	
	
	
