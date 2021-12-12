package lab9q1;

public class driver {
	
	public static void main(String args[]) {
		
	
	
	Book[] book = new Book[2];
	CD[] cd = new CD[2];
	
	book[0] = new Book("Gerad McDelvin","The Road", 285);
	System.out.println(book[0]);
	
	cd[0] = new CD("The rolling rocks", "Debut11", 7);
	System.out.println(cd[0]);
	}
}
