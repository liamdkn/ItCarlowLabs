//Lab 15 Liam Durkan
//this is not the driver class?
package lab15;

import java.util.Scanner;//import scanner

public class VerifyRangeTest {
	
	public static void main(String [] args) {
	
		Scanner scan = new Scanner( System.in );//setup scanner
		
		System.out.print( "Please enter an integer: " );
		int num1 = scan.nextInt();
		
		
		if(num1 >= 1 && num1 <= 100) {//for loop checks weather greater than 1 and less than 100
			System.out.println("Number in range!!!");
		}
		else {
			System.out.println("out of range");
		}
		
		String password = scan.nextLine();// read in string for password

	}
}