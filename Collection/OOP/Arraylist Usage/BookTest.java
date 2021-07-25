package lab1;


public class BookTest {
	public static void main(String[] args) {
		Books books=new Books();
		Author a1=new Author("Daniel", 50);
		Book b1=new Book("Java",a1,2000,200);
		books.insert(b1);
		
		Author a2=new Author("Liang", 65);
		Book b2=new Book("Programming", a2, 2010, 300);
		books.insert(b2);
		
		books.DisplayBooks();
		
	    System.out.println(books.Contains(b1));
		
	}

}
