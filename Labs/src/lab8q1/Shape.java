package lab8q1;

public abstract class Shape
{
	private String name;
	private String colour;
	
	public Shape(String name, String colour)
  	{ 
  		this.name = name; 
  		this.colour = colour; 
  	} 
  	
  	public String toString()
  	{
  		return ("---\nShape Name = " + this.name + "\nShape colour = " + this.colour);
  	}
  	
  	public abstract double area();
}
