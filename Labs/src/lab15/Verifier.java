//Lab 15 Liam Durkan
//driver class
package VerifyRangeTest;

import java.util.Scanner;

import lab15.VerifyRangeTest;

public class Verifier extends VerifyRangeTest{
	
	
	public static void main(String[] args) {//main method
		
		Scanner scan = new Scanner( System.in );
	
	
		
		int low = 1;//chosen range 
		int high = 100;
		boolean continueLoop = true;//when false stops the do while loop from repeating
		String password;
		
		do {
	
			System.out.print( "Please enter an integer: " );
			int value = scan.nextInt();//take in number 
			
			
	
			try {
				verifyIntRange(value, low, high);//calls verifyint range method 
				System.out.println("Please enter a password: ");//after method is completed move onto password 
				scan.nextLine();
				password = scan.nextLine();
				verifyPasswordStrength(password);//call verify password method 
				System.out.println("Press the enter key to continue...");
				try{System.in.read();}//waits for enter key 
				catch(Exception j){}
			} 
			catch(MyOutOfRangeException e){
				
					System.out.println("Press the enter  key to continue...");
					try{System.in.read();}//waits for enter key 
					catch(Exception j){}
			} catch (MyInvalidPasswordException e) {
				
			}
		}
		while(continueLoop);
		
	}//end main
	
	
	public static void verifyIntRange(int value, int low, int high) throws MyOutOfRangeException {//verify range method
		
		if(value >= low && value <= high) {//checks number values against chosen range
			System.out.println("Number in range!!!");
		}
		else {
			throw new MyOutOfRangeException(value);
		}
	}//end verifyIntRange method
	
	public static void verifyPasswordStrength(String password) throws MyInvalidPasswordException {
		if(password.length() >= 8) {//when password is less than 8 enters loop
			System.out.println("Good Password");
		}
		else {
			throw new MyInvalidPasswordException(password);//calls my invalid method in different class
		}
	}
}//end class
		
		
		
		
		
		
		
		
		
		
