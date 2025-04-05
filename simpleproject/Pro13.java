package simpleproject;

import java.util.Scanner;

//addition of two  user i/p numbers
public class Pro13 {

	public static void main(String[] args) {
		int a,b,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();  //convert string i/p to integer
		System.out.println("enter value of b");
		b=sc.nextInt();  //convert string i/p to integer
		result=a+b;
		System.out.println("addition is "+result);
	}

}
