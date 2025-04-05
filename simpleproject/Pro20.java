package simpleproject;
/*if else if--it used to check more that 2 condition
 * if(condition){
 * print statement;
 * }
 * else if(condition2){
 * print statement;
 * }
 * else if(condition3){
 * print statement;
 * }
 *else
 *{
 *print statement;
 *}
*/
import java.util.Scanner;

//find greater number between 3 numbers
public class Pro20 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
	}

}
