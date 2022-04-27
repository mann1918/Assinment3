package problem2;

public class Book {
	private static String bookName;
	private static Author author;
	private static double price;
	private static int qty;
	public static String getBookName() {
		return bookName;
	}
	public static void setBookName(String bookName) {
		Book.bookName = bookName;
	}
	public static Author getAuthor() {
		return author;
	}
	public static void setAuthor(Author author) {
		Book.author = author;
	}
	public static double getPrice() {
		return price;
	}
	public static void setPrice(double price) {
		Book.price = price;
	}
	public static int getQty() {
		return qty;
	}
	public static void setQty(int qty) {
		Book.qty = qty;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book []";
	}
	
	
	

}
