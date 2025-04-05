package String_program;

import java.time.LocalDate;
import java.time.LocalTime;

//time function----
public class Pro78 {

	public static void main(String[] args) {
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalTime ld1=LocalTime.of(5,6,25);
		System.out.println(ld1);
		
		LocalTime ld2=LocalTime.parse("05:11:08");
		System.out.println(ld2);
		
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		
		System.out.println(lt.plusHours(2));
		System.out.println(lt.minusMinutes(10));

	}

}
