package lab9q1;

public class CD extends LibraryItem implements LoanItem{

	//attributes
	private String band;
	private String title;
	private int numTracks;
	
	
	public CD(String band, String title, int numTracks) {
		// TODO Auto-generated constructor stub
	}
	//getters and setters
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumTracks() {
		return numTracks;
	}
	public void setNumTracks(int numTracks) {
		this.numTracks = numTracks;
	}
	
	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "CD [band=" + band + ", title=" + title + ", numTracks=" + numTracks + "]";
	}
	
	
}
