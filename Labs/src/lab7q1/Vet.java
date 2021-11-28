package lab7q1;

public class Vet extends AnimalTest {

	public Vet(String name) {
		super();
		
	}






	//methods
	public void vaccinated(String type) {
			System.out.println(name + "is vaccinating");
			 
			if(type == "Dog") {
				System.out.println("Dog has been vaccinated");
			}
			else if(type == "Cat") {
				System.out.println("Cat has been vaccinated");
			}
			
	}
}
