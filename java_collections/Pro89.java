package java_collections;

import java.util.HashMap;
import java.util.Map;

/*Map---interface ---will stored data in key and value pair
 * key must be unique but value can be duplicate
 * each key and value pair is known as entry
 * with map implemented HshMap,LinkedHashMap,TreeMap
 */
public class Pro89 {

	public static void main(String[] args) {
		Map<Integer,String>m =new HashMap<Integer,String>();
		m.put(100, "java");
		m.put(200, "python");
		m.put(300, null);
		m.put(null, null);
		System.out.println(m);
		for(Map.Entry k:m.entrySet())
		{
			System.out.println(k.getKey()+" "+k.getValue());
		}

	}

}
