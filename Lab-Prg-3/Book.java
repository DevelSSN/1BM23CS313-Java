import java.util.Scanner;

public class Book {

	private String name;
	private String author;
	private double price;
	private int num_pages;

	public Book (String name, String author, double price, int num_pages) {
	this.name=name;
	this.author=author;
	this.price=price;
	this.num_pages=num_pages;
	}

	public void setName (String newVar) {
	name = newVar;
	}

	public String getName () {
	return name;
	}

	public void setAuthor (String newVar) {
	author = newVar;
	}

	public String getAuthor () {
	return author;
	}

	public void setPrice (double newVar) {
	price = newVar;
	}

	public double getPrice () {
	return price;
	}

	public void setNum_pages (int newVar) {
	num_pages = newVar;
	}


	public int getNum_pages () {
	return num_pages;
	}

	public String toString()
	{
		return(String.format("%-25s\t%-25s\t%-8.2f\t%-5d",this.name,this.author,this.price,this.num_pages));
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter no. of books:");
		int n=sc.nextInt();
		sc.nextLine();
		Book[] books=new Book[n];

		for(int i=0;i<books.length;i++){
			System.out.println("\nEnter book "+(i+1)+" details:");
			String name=sc.nextLine();
			String author=sc.nextLine();
			double price=sc.nextDouble();
			int num_pages=sc.nextInt();
			sc.nextLine();

			books[i]=new Book(name, author, price, num_pages);
		}

		System.out.println("\nALL BOOKS Listed Below:\n");

		for(Book book:books){
			System.out.println(book);
		}

		sc.close();

	}
}
