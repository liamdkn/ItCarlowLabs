//Lab 15 Liam Durkan
package VerifyRangeTest;

public class MyOutOfRangeException extends Exception {//etends brances off the exception 

	public MyOutOfRangeException(int value) {
		System.out.println("MyOutOfRangeException: " + "number " +value +" is out of range");//message to show user the number is not within chosen range 
	}

	
}
