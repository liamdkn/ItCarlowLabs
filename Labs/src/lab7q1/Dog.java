package lab7q1;

public class Dog extends Animal{

	public Dog(String type, int age, char gender) {
		super(type,age,gender);
	}

	//MEthods specific to dog
	public void eat() {
		System.out.println("The dog is eating");
	}

	public void sleep() {
		System.out.println("The dog is Sleeping");
	}

	public void makeSound() {
		System.out.println("Woof Woof!");
	}

	@Override
	public String toString() {
		return "Dog:" + super.toString();
	}
	
	
	
	
	
	
	

	
	
}
