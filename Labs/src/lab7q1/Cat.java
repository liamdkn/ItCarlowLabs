package lab7q1;

public class Cat extends Animal {

	public Cat(String type, int age, char gender) {
		super(type,age,gender);
	}

	//Methods specific to dog
	public void eat() {
		System.out.println("The cat is eating");
	}

	public void sleep() {
		System.out.println("The cat is Sleeping");
	}

	public void makeSound() {
		System.out.println("Meow purr!");
	}

	//toString
	public String toString() {
		return "Cat:" + super.toString();
	}
	

}
