public class Book {
	private String title;
	private String isbn;
	private String authorName;
	private String biography;
	private boolean avail = true;
	
	public Book(String title, String isbn, Author author){
		this.title = title;
		this.isbn = isbn;
		authorName = author.getAuthorName();
		biography = author.getBiography();
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public String getBiography() {
		return biography;
	}
	
	public boolean getAvail() {
		return avail;
	}
	
	//setter
	public void isAvail() {
		avail = true;
	}
	
	public void notAvail() {
		avail = false;
	}
}
