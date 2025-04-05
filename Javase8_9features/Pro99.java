package Javase8_9features;
//stream with filter function
import java.util.Arrays;
import java.util.List;

public class Pro99 {

	public static void main(String[] args) {
		List<String>al=Arrays.asList("java","python","sql","WD");
		al.stream().filter((s)->s.startsWith("j"))
				.forEach(System.out::println);
		
		

	}

}
