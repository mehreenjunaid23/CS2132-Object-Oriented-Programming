package lab3_3;

public class book {
	public String title ;
	public String author;
	public int publidation_year;

	public book(){
		title="";
		author="";
		publidation_year=0;}
	
	public book(String t, String a , int y){
		title=t;
		author=a;
		publidation_year=y;
	}
	public book(String t, String a){
		title=t;
		author=a;
		publidation_year=0;
	}
	
	public void setTitle(String t) {
		title=t;
	}
	public void setAuthor(String a) {
		author=a;
	}
	public void setYear(int y) {
		publidation_year=y;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return publidation_year;
	}
	public void print() {
		System.out.println("\n\n----------Book details-----------");
		System.out.println("\nTitle: " + title);
		System.out.println("Author: " + author);
		System.out.println("Year of publication: " + publidation_year);}
}
