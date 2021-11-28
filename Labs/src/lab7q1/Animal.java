package lab7q1;

public class Animal {

	private String type;
	private int age;
	private char gender;
	
	//constructor
	public Animal(String type, int age, char gender) {
		setType(type);
		setAge(age);
		setGender(gender);
	}
	
	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//toString
	public String toString() {
		return type + ", age: " + age + ", gender: " + gender;
	}
	
	
	//methods
	public void eat() {
		System.out.println("Animal is eating");
	}

	public void sleep() {
		System.out.println("Animal is Sleeping");
	}
	
	public void makeSound() {
		System.out.println("A generic animal sound");
	}



	
	

	
	
}
