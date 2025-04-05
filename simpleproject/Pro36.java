package simpleproject;
//break statment
import java.util.Scanner;
public class Pro36 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(i==10)
		{
			break;
		}
		System.out.println(i);
	}

	}

}
