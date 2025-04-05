package simpleproject;

import java.util.Scanner;

/* according to  inputs it prints days.....
 * syntax:switch(expression)
 * case 1:printstatement;
 *        break;
 * case 2:printstatment;
 *        break;
 *        
 *default:printstatment;               
 */
public class Pro23 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		n=sc.nextInt();
		switch(n)
		{
		case 1:System.out.println("day is monday......");
		       break;
		case 2:System.out.println("day is Tues......");
	           break;
		case 3:System.out.println("day is Wens......");
	           break;
		case 4:System.out.println("day is Thrus......");
	           break;
		case 5:System.out.println("day is Fri......");
	          break;
		case 6:System.out.println("day is Sat......");
	         break;
		case 7:System.out.println("day is Sun......");
	       break;
	    default:System.out.println("invalid choice.....");   
		}

	}

}
