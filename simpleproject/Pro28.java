package simpleproject;

import java.util.Scanner;

//find the fibonacci series---addition of first two number genrate next number
// 0  1   1  2  3  5  8
public class Pro28 {

	public static void main(String[] args) {
		int i;
		int n;
		int n0=0;
		int n1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter end value");
		n=sc.nextInt();
		System.out.println(n0);
		System.out.println(n1);
		for(i=1;i<=n;i++)
		{
			int n2=n0+n1;
			n0=n1;
			n1=n2;
			System.out.println(n2);
			  
		}
	

	}

}
