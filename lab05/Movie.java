package lab05;

public class Movie {

	String title;
	Integer year;
	
	public Movie(String title, Integer year) {
		this.title = title;
		this.year = year;
	}
	
	public String getTitle(String title) {
		return this.title;
	}
	
	public Integer getYear(Integer year) {
		return this.year;
	}
	
	public String toString() {
		return this.title + " released in " + this.year;
	}
}
