public class Book {
	private String title;
	private String isbn;
	private Author author;
	private boolean avail = true;
	
	public Book(String title, String isbn, Author author){
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public Author getAuthor() {
		return author;
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
