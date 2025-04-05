package simpleproject;

import java.util.Scanner;
//to check given number is prime or not----number devide by 1 or itself

public class Pro29 {

	public static void main(String[] args) {
		int i;
		int n;
	    int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number value");
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not number");
		}
		
	

	}

}
