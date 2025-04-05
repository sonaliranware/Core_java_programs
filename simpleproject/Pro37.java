package simpleproject;
//continue statment
import java.util.Scanner;
public class Pro37 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(i==10)
		{
			continue;
		}
		System.out.println(i);
	}

	}

}
