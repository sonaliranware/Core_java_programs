package simpleproject;

import java.util.Scanner;

/*do -while loop----- it used when we dont know the number of iterations,
 * exit control loop
 * do{
 * print statement;
 * incre/decre;
 * }while(condition);
 */
//display 1 to n numbers using do while loop
public class Pro35 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	int i=11;
	do
	{
		System.out.println(i);
		i++;
	}while(i<=n);

	}

}
