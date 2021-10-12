package lab2;

public class HotelRoom
{ 
	private int roomNumber;
	private String roomType;
	private int roomAvalability;
	private double roomRate;
							
	public HotelRoom()			// constructor method #1
	{
		setroomNumber(0);
		setroomType("Single");
	}
		
	public HotelRoom(int ron, String rot)	// constructor method #2
	{
		setroomNumber(ron);
		setroomType(rot);
	}

	public void setroomNumber(int ron)
	{
		roomNumber = ron;		
	}

	public double getroomNumber()
	{
		return roomNumber;
	}
	
	
	
	public void setroomType(String rot)
	{
		roomType = rot;		
	}

	public String getroomType()
	{
		return roomType;
	}
	
	public void setroomAvalability(int ava)
	{
		roomAvalability = ava;		
	}

	public int getroomAvalability()
	{
		return roomAvalability;
	}
	
	
	public void setroomRate(double rat)
	{
		roomRate = rat;		
	}

	public double getroomRate()
	{
		return roomRate;
	}
} 
