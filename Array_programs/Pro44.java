package Array_programs;

import java.util.Scanner;

//array reverse
public class Pro44 {

	public static void main(String[] args) {
		int n,i;
	
		int marks[]=new int[1000];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		n=sc.nextInt();
		
	System.out.println("enter your marks");
		for(i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println(" your marks is");
		for(i=0;i<n;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println(" your reverse order marks is");
		for(i=n-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
	}

}
