import java.util.ArrayList;

class Book {
	private String title, author, publisher, price;
	
	public Book(String title, String author, String publisher, String price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String toString() {
		return title +" "+author+" "+publisher+" "+price;

	}
}

public class JavaEx {
	public static void main(String[] args) {
		
		ArrayList<Book> a = new ArrayList<>();
		
		Book b1 = new Book("명품Java", "황기태", "생능출판사", "32000");
		a.add(b1);
		
		Book b2 = new Book("두근두근 파이썬", "천인국", "생능출판사", "24000");
		a.add(b2);

		for(int i=0;i<a.size();i++) {
			Book v = a.get(i);
			System.out.println(v);
		}
	}
}