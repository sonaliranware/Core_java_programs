package java_collections;
//operations in ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Pro84 {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("SQL");
		al.add("WD");
		al.add("WD");
		al.add(null);
		System.out.println(al);
		System.out.println("displaiyng second position ele  "+al.get(1));
		al.set(1, "spring");
		System.out.println("setting second position "+al);
		al.remove(3);
		System.out.println("after removing  "+al);
		Collections.sort(al);
		System.out.println("your sorted data is "+al);
		
		
		

	}

}
