package Array_programs;

import java.util.Scanner;

//display even and odd number into array
public class Pro46 {

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
		System.out.println("even number");
		for(i=0;i<n;i++)
		{
			if(marks[i]%2==0) {
				System.out.println(marks[i]);
			}
		}
		System.out.println("odd number");
		for(i=0;i<n;i++)
		{
			if(marks[i]%2!=0) {
				System.out.println(marks[i]);
			}
		}
	}

}
