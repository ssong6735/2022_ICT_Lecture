

public class Book {

	String bookName;
	String author;
	
	public Book() {
		
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("å �̸�: " + this.getBookName());
		System.out.println("å ����: " + this.getAuthor());
		System.out.println();
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return this.bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
	
}
