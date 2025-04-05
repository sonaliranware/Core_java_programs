package java_collections;
/*genrics---*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Pro92 {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("SQL");
		al.add("WD");
		//al.add(1233);
		ListIterator itr=al.listIterator();
	   
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
