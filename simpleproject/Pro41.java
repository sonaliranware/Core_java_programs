package simpleproject;
//left angle
import java.util.Scanner;
public class Pro41 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	int i,j,k;
	for(i=1;i<=n;i++)
	{
		for(k=n-i;k>=1;k--)
		{
			System.out.print(" ");
			
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
