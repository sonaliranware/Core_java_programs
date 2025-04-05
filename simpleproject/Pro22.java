package simpleproject;

import java.util.Scanner;

//accept any character from user then we can check given chracter is consonant or vowels. 
public class Pro22 {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any charcter");
		ch=sc.next().charAt(0);
		System.out.println(ch);
		if(ch=='a' ||ch=='e'||ch=='i' ||ch=='o'||ch=='u' ||ch=='A'||ch=='E' ||ch=='I'||ch=='O' ||ch=='U')
		{
			System.out.println("given character is vowel");
		}
		else
		{
			System.out.println("character is consonant");
		}

	}

}



/*The marks obtained by a student in 5 different subjects 
 cal percentage and according to percentage print grade

Percentage above or equal to 60 - First division
Percentage between 50 and 59 - Second division
Percentage between 40 and 49 - Third division
Percentage less than 40 – Fail
*/

















