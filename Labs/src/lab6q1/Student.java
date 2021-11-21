package lab6q1;

import java.util.Arrays;

public class Student extends Person{

	//Variables 
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private int count = 0;
	
	//Constructors
	public Student(String name, String address, String[] courses, int[] grades) {
		super(name, address);
		this.courses = courses;
	     this.grades = grades;
	}
	
	//Getters and Setters
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

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	
	//toString 
	public String toString() {
		return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
				+ Arrays.toString(grades) + "]";
	}

	//Misc
	public void addCourseGrade(String courses, int grades) {
		for(int i = 0; i > 2; i++) {
		this.courses[i] = courses;
		this.grades[i] = grades;
		}
	}

	public void printGrades() {
		for(int i = 0; i > 2; i++) {
		System.out.println(grades[i]);
		}
	}

	public String getAverageGrade() {
		
		return null;
	}
	
	

	

	
	
	
}