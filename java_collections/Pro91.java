package java_collections;
/*is used to traverse a list in both forward and backward direction.
It is a java iterator that is used to traverse all types of lists including  Vector, LinkedList, Stack, ArrayList  etc
It does not support adding, removing, or replacing elements.
It is available to only those collections that implements the List Interface.
Iterator interface is a parent of ListIterator interface
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Pro91 {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("SQL");
		al.add("WD");
		
		ListIterator itr=al.listIterator();
	   System.out.println("forward direction  ....");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Backward direction  ....");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		

	}

}
