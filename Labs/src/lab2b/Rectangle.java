package lab2b;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle()
	{
		setlength(1);
		setwidth(1);
	}
	
	public Rectangle(int len, int wid)	// constructor method #2
	{
		setlength(len);
		setwidth(wid);
	}
	public void checkValues(int length,int width,int len,int wid) {
		if(length > 0 && length < 40) {
			length = len;
		}
		if(width > 0 && width < 40) {
			width = wid;
		}
	}
	
	public void setlength(int len) {
		length = len;
	}
	
	public double getlength()
	{
		return length;
	}
	
	
	public void setwidth(int wid) {
		width = wid;
	}
	
	public double getwidth()
	{
		return width;
	}
	
	public int recArea() {
		return (length*width);
	}
	public int recPerimeter() {
		return (length+width)*2;
	}
	
	
	
	
	
}
