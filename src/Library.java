import java.util.*;

public class Library {
	private HashSet<Book> books;
	
	public Library() {
		books = new HashSet<Book>();
	}

	public void addBook(Book book) {
		System.out.println("Book added to library: " + book.getTitle());
		books.add(book);
	}
	
	public void returnBook(Borrower borrower, Book book) {
		borrower.returnBook(book);
		System.out.println(borrower.getName() + " returned: " + book.getTitle());
		book.isAvail();
	}
	
	public void borrowBook(Borrower borrower, Book book) {
		if(book.getAvail() == true) {
			borrower.addBorrowedBook(book);
			System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
			book.notAvail();
		}else {
			System.out.println("Book is not available");
		}
		
	}

	public void displayLibraryBooks() {
		System.out.println("Books in library");
		for(Book book: books) {
			if(book.getAvail() == true) {
				System.out.println("Title: " + book.getTitle());
				System.out.println("ISBN: " + book.getISBN());
				System.out.println("Author: " + book.getAuthor().getAuthorName());
				System.out.println("Biography: " + book.getAuthor().getBiography());
				System.out.println("-------------------------");
			}
		}
	}

	
	
	
	
}
