package Javase8_9features;
//stream with map function
import java.util.Arrays;
import java.util.List;

public class Pro98 {

	public static void main(String[] args) {
		List<String>al=Arrays.asList("java","python","sql","WD");
		al.stream().map((s)->s.toUpperCase())
		.forEach(System.out::println);
		
		

	}

}
