package java_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro90 {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("SQL");
		al.add("WD");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
