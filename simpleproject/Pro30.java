package simpleproject;

import java.util.Scanner;
//print 1 to 50 all even number

public class Pro30 {

	public static void main(String[] args) {
		int i;
		int n;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number value");
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		
	

	}

}
