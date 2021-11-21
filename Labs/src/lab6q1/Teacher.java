package lab6q1;

import java.util.Arrays;

public class Teacher extends Person{

	private int numCourses;
	private String[] courses; 
	
	//constructor
	public Teacher(String name, String address, int numCourses, String[] courses) {
		super(name, address);
		this.setNumCourses(numCourses);
		this.setCourses(courses);
	
	}
	
	//getter and setters
	public int getNumCourses() {
		return numCourses;
	}

	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	//toString
	public String toString() {
		return "Teacher [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + "]";
	}

	
	
	//misc
	public boolean addCourse(String course) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeCourse(String course) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
