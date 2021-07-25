package lab1;


public class Book {
	private String title;
	private Author author;
	private int publicationYear;
	private double price;
	public Book(String tit, Author au, int pubYear, double pr) {
		title=tit;
		author=au;
		publicationYear=pubYear;
		price=pr;
	}
	
	public void Display() {
		System.out.println("Book Title: " + title);
		System.out.println("Author name and age: " + author.getName() + "," + author.getAge());
		System.out.println("Publication year: " + publicationYear);
		System.out.println("Price: " + price);
		
	}
	
	public boolean Compare(Book b) {
		if(b.title.equals(title) && b.publicationYear==publicationYear) 
			return true;
		else 
			return false;
				
	}

}
