package Array_programs;

import java.util.Scanner;

//multidimesional array---rows and columns 
public class Pro47 {

	public static void main(String[] args) {
		int a[][]=new int[20][20];
		int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and col values");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("enter your values");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	
		System.out.println("enter array element is");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\t"+a[i][j]);
				
			}
			System.out.println();
		}
	}

}
