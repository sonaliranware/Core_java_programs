package simpleproject;
/*nested loop---loop inside another loop*/
import java.util.Scanner;
public class Pro38 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
