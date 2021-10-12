package lab2;

//Student Name 	: Liam Durkan
//Student Id Number: 
//Date 			: October-2020
//Purpose 			: My first class implementation

public class HotelTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		HotelRoom roomA = new HotelRoom();		// Create an instance of our Thermometer class
		HotelRoom roomB = new HotelRoom();

	
		roomA.setroomNumber(200);
		roomA.setroomType("Single");
		roomA.setroomAvalability(1);
		roomA.setroomRate(100);
		System.out.println("Hotel Room " +roomA.getroomNumber() +" and is a " +roomA.getroomType() +";  Avalibality: " +roomA.getroomAvalability() +"; Room Rate " +roomA.getroomRate() );
		
		roomB.setroomNumber(201);
		roomB.setroomType("Double");
		roomB.setroomAvalability(0);
		roomB.setroomRate(80);
		System.out.println("Hotel Room " +roomB.getroomNumber() +" and is a " +roomB.getroomType() +";  Avalibality: " +roomB.getroomAvalability() +"; Room Rate " +roomB.getroomRate() );
		
		
	} 
	}
