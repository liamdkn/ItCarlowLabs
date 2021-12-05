package lab8q1;

public abstract class TwoDShape extends Shape
{
	public TwoDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double area();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}
