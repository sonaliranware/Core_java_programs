package simpleproject;
/*nested loop---loop inside another loop*/
import java.util.Scanner;
public class Pro40 {

	public static void main(String[] args) {
	int n;
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter n");
	//n=sc.nextInt();
	char i,j;
	for(i='A';i<='E';i++)
	{
		for(j='A';j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}

	}

}
