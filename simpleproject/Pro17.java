package simpleproject;

import java.util.Scanner;

/*control statments---manage the flow of control
 * 1)Decision making/conditional--if,if else,if else if,switch
 * 2)looping statements---for loop,while loop,do-while
 * 3)branching---break,continue
 * 
 * 
 * if statement---when condition is only true
 */
//pro---to check given number is positive
public class Pro17 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		n=sc.nextInt();
		if(n>=0)
		{
			System.out.println("given number is positive");
		}

	}

}
