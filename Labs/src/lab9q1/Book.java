package lab9q1;

public class Book extends LibraryItem implements LoanItem{

	//attributes
	private String author;
	private String title;
	private int numPages;
	
	
	public Book(String author, String title, int numPages) {
		// TODO Auto-generated constructor stub
	}
	//getters and setters
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	
	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", numPages=" + numPages + "]";
	}
	
	

	
}
