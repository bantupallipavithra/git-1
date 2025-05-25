package Book.com;

public class BookMain {
	public static void main(String[] args) {
		Book book=new Book();
		book.setBookDetails("Java Basics", "John Doe",450.0);
		String result=book.getBookDetails();
		System.out.println(result);
}

}
