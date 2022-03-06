//Lab 15 Liam Durkan
package VerifyRangeTest;

public class MyInvalidPasswordException extends Exception {

	public MyInvalidPasswordException(String password) {
		System.out.println("MyInvalidPasswordException: " +password +" is not strong enough!");//message to show user password is not long enough
	}

}
