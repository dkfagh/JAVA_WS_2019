import java.util.Scanner;

class Book {
	String title, author;
	public Book(String title, String authoer) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i<book.length ; i++) {
			System.out.print("����>>");
			String title = s.nextLine();
			System.out.print("����>>");
			String author = s.nextLine();
			book[i] = new Book(title, author);
		}
		
		for(int i = 0 ; i<book.length ; i++)
			System.out.println("("+book[i].title+", "+book[i].author+")");
		
		s.close();
	}
}