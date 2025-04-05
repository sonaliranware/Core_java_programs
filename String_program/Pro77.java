package String_program;

import java.time.LocalDate;

//working date function.....
public class Pro77 {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld1=LocalDate.of(2024, 11, 19);
		System.out.println(ld1);
		
		LocalDate ld2=LocalDate.parse("2024-11-19");
		System.out.println(ld2);
		
		LocalDate ld3=ld.minusDays(2);
		System.out.println(ld3);
		
		LocalDate ld4=ld.plusDays(2);
		System.out.println(ld4);
		
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getDayOfMonth());
		

	}

}
