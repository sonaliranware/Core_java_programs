package Array_programs;

import java.util.Scanner;

//marks----100,40,50,20,77,99,27
public class Pro42 {

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

	}

}
