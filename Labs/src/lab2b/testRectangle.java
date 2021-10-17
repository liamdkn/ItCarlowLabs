package lab2b;

//Student Name 	: Liam Durkan
//Student Id Number: C00264405
//Date 			: October-2020


public class testRectangle
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Rectangle length = new Rectangle();		
		Rectangle width = new Rectangle();

		
		length.setlength(1);
		width.setwidth(1);
		Rectangle.recArea();
		
		
		
		
		
		System.out.print("Length: " +length.getlength() +" Width: " +width.getwidth());
		System.out.println(Rectangle.recArea());

	}
}

