package java_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//queue---First In first Out
public class Pro93 {

	public static void main(String[] args) {
	Queue<String>q= new LinkedList<String>();
	q.add("start");
	q.add("progress");
	q.add("Done");
	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.isEmpty());
	q.poll();
	System.out.println(q);
	
	

	}

}
