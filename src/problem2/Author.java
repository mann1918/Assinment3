package problem2;

public class Author extends Book {
	private static String authorName;
	private static String email;
	private static char gender;
	public static String getAuthorName() {
		return authorName;
	}
	public static void setAuthorName(String authorName) {
		Author.authorName = authorName;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Author.email = email;
	}
	public static char getGender() {
		return gender;
	}
	public static void setGender(char gender) {
		Author.gender = gender;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author []";
	}
	
	

}
