package Array_programs;

import java.util.Scanner;

//min number into array 
public class Pro45 {

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
		int min=marks[0];
		for(i=1;i<n;i++)
		{
			if (min>marks[i])
			{
				min=marks[i];
			}
		}
		System.out.println("minimum marks is"+min);

	}

}
