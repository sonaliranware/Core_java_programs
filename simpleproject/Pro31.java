package simpleproject;

import java.util.Scanner;

/*while loop----- it used when we dont know the number of iterations,entry control loop
 * while(condition)
 * {
 * print statement;
 * incre/decre;
 * }
 */
//display 1 to n numbers using while loop
public class Pro31 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	int i=11;
	while(i<=n)
	{
		System.out.println(i);
		i++;
	}

	}

}
