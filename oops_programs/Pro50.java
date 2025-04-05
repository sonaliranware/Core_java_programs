package oops_programs;

import java.util.Scanner;

class Book
{
	String author;
	int id;
	String name;
	double price;
	Scanner sc=new Scanner(System.in);
	//returntype methodname(argument){}
	void get()//default method
	{
		System.out.println("enter author name");
		author=sc.next();
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter price");
		price=sc.nextDouble();
		
	}
	void disp()
	{
		System.out.println("name is "+name);
		System.out.println("id is"+id);
		System.out.println("author is"+author);
		System.out.println("price is "+price);
	}
}
public class Pro50 {

	public static void main(String[] args) {
	Book b[]=new Book[5]; //array of objects
	int i;
	for(i=0;i<5;i++)
	{
		b[i]=new Book();   //allocating memory 5 times....
	}
	System.out.println("accesing data from user");
	for(i=0;i<5;i++)
	{
	
	b[i].get(); //getting data 5 time
	}
	System.out.println("Disaply info");
	for(i=0;i<5;i++)
	{
	
	b[i].disp(); //dispalying data 5 times
	}
	}

}
