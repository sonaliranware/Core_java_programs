package simpleproject;

import java.util.Scanner;


public class Pro14 {

	public static void main(String[] args) {
		int a,b,c,d,e,total;
		double per;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();  //convert string i/p to integer
		System.out.println("enter value of b");
		b=sc.nextInt();  //convert string i/p to integer
		System.out.println("enter value of c");
		c=sc.nextInt();  //convert string i/p to integer
		System.out.println("enter value of d");
		d=sc.nextInt();  //convert string i/p to integer
		System.out.println("enter value of e");
		e=sc.nextInt();  //convert string i/p to integer
		total=a+b+c+d+e;
		System.out.println("addition is "+total);
		per=total*0.2;
		System.out.println(per);
	}

}
