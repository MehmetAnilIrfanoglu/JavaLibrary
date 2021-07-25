package lab1;

import java.util.ArrayList;

public class Books {
	private int numberOfBooks=0;
	private ArrayList<Book> books= new ArrayList<Book>(1000);
	
	public void insert(Book b) {
		books.add(b);
		numberOfBooks++;
	}
	
	public void  DisplayBooks() {
		for (int i=0; i<numberOfBooks; i++) {
			books.get(i).Display();
			System.out.println();
		}
		
	}
	
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	
	public boolean Contains(Book b) {
		return books.contains(b);
		
	}
	
	

}
