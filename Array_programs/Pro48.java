package Array_programs;

import java.util.Scanner;

//transpose of matrix
public class Pro48 {

	public static void main(String[] args) {
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int trans[][]=new int[20][20];
		int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and col values");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("enter your for first array values");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter your second array ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
			trans[i][j]=a[i][j]+b[i][j];
			
				
			}
			
		}
		System.out.println("your addition matrix is:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
			
				System.out.println("\t"+trans[i][i]);
				
			}
			
			System.out.println();
		}
	}

}
