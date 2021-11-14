package lab5q1;

public class Point {
	
	private int x;
	private int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	 

	
}


class Circle extends Point{
	Circle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	private int z;
	private int radius;
	public static void main(String[] args) {
	
	

	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	
	public int makeRadius(int x, int y){
		radius = x*y;
		return radius;
	}
	}
	
}