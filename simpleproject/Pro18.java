package simpleproject;

import java.util.Scanner;

/*if else---it check the condition eighter true or false
 * syntax:
 * if(condition){
 * statement;
 * }
 * else
 * {
 * statement;
 * }
 * pro---check given number is odd or even
 */
public class Pro18 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}

	}

}
