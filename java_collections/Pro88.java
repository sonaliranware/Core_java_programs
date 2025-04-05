package java_collections;
import java.util.HashSet;
/*Hash Set---class which is implementrd by set interface
 * it accepts only unqiue values
 * it accepts null values
 * it works internally by hashing mechanism so not maintainig insertion order
 */
public class Pro88 {
public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("java");
		hs.add("Advjava");
		hs.add("python");
		hs.add("sql");
		hs.add(null);
		hs.add("sql");
		System.out.println(hs);
		String s="java";
		System.out.println(s.hashCode());
		
		

	}

}
