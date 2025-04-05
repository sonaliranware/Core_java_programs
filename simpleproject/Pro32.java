package simpleproject;

import java.util.Scanner;

//find the reverse number ---123---reverse 321
public class Pro32 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	int rem;
	int sum=0;
	while(n!=0)
	{
		rem=n%10;
		sum=sum*10+rem;
		n=n/10;
		
	}
	System.out.println(sum);

	}

}
