package Javase8_9features;

import java.util.ArrayList;

import java_collections.Book;

public class Pro97 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("wd");
		/*for(String s:al)
		{
			System.out.println(s);
		}*/
		/*for(Book s:al)
		{
			System.out.println(s.bid+" "+s.bname+" "+s.price);
			
		}*/
		//al.forEach(s->System.out.println(s.id+" "+s.name+" "+s.salary));
		//al.forEach(s->System.out.println(s));
		

	}

}
