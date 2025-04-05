package java_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pro94 {
	public static void main(String[] args)
	{
		Deque<String>d=new ArrayDeque<String>();
		d.push("java");
		d.push("python");
		d.push("WD");
		System.out.println(d);
		System.out.println("peek "+d.peek());
       d.pop();
       System.out.println("after popping "+d);
	}
}
