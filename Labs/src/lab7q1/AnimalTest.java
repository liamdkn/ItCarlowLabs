package lab7q1;

//Author 			: Liam Durkan
//Date 			: 	November 2021
//Purpose 			: A test driver program for our Animal class

public class AnimalTest
{
	protected String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main (String args[])
	{
		
	
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();
		
		Vet vet = new Vet("Stephen");
		vet.vaccinated();
		
		
		
		
		
		
		

		/*Animal cow = new Cow("Daisy", 3, 'F');
		System.out.println(cow);
		cow.eat();
		cow.sleep();
		cow.makeSound(); */
		
		

		}

	
}
