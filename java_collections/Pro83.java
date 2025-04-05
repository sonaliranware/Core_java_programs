package java_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro83 {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("SQL");
		al.add("WD");
		System.out.println(al);
		//displaying data by using for loop
		for(String i:al)
		{
			System.out.println(i);
		}
		//displaying data by using iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
