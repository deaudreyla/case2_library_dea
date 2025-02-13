import java.util.*;

public class Borrower {
	private HashSet<Book> borrowedBooks;
	private String name;
	
	public Borrower(String name) {
		borrowedBooks = new HashSet<Book>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addBorrowedBook(Book book) {
		borrowedBooks.add(book);
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
	
	public void displayBorrowedBooks() {
		System.out.println(name + "'s Borrowed Books:");
		for(Book book: borrowedBooks) {
			System.out.println("Title: " + book.getTitle());
			System.out.println("ISBN: " + book.getISBN());
			System.out.println("Author: " + book.getAuthor().getAuthorName());
			System.out.println("Biography: " + book.getAuthor().getBiography() );
			System.out.println("-------------------------");
		}
	}
	
}
