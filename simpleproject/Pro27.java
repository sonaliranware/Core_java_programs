package simpleproject;

import java.util.Scanner;

//find the factorial of given number
//5!====1*2*3*4*5--120
public class Pro27 {

	public static void main(String[] args) {
		int i;
		int n;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			  
		}
		 System.out.println("factorial is"+fact);

	}

}
