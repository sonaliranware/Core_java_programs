package java_collections;

import java.util.LinkedList;

class Book
{
	int bid;
	String bname;
	double price;
	public Book(int bid, String bname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	
}
public class Pro86 {

	public static void main(String[] args) {
		LinkedList<Book>al=new LinkedList<Book>();
		Book b=new Book(100,"java",1223.56);
		Book b1=new Book(200,"python",1453.56);
		Book b2=new Book(300,"WD",78223.56);
		Book b3=new Book(400,"SQL",5223.56);
		al.add(b);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		for(Book s:al)
		{
			System.out.println(s.bid+" "+s.bname+" "+s.price);
			
		}
		//al.forEach(s->System.out.println(s.id+" "+s.name+" "+s.salary));
		
		

	}

}
