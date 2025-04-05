package simpleproject;

import java.util.Scanner;

/*accept shooping amount from user cal discount and final price
amt-10000----10%
amt>10000 && amt<25000---25%
amt>25000 && amt 50000 ----50%
above 50000 ---print not able give discount 
*/
public class Pro21 {
public static void main(String[] args) {
	int amt;
	double discount=0.0;
	double finalamt=0.0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter amt");
	amt=sc.nextInt();
	if(amt<5000)
	{
		System.out.println("sorry not able to give discount");
	}
	else if(amt>=5000 && amt<10000)
	{
		discount=(amt*0.1);
		finalamt=amt-discount;
		System.out.println("your discount is"+discount);
		System.out.println("your payable amt is "+finalamt);
		
	}
	else if(amt>=10000 && amt<25000)
	{
		discount=(amt*0.25);
		finalamt=amt-discount;
		System.out.println("your discount is"+discount);
		System.out.println("your payable amt is "+finalamt);
		
	}
	else if(amt>=25000 && amt<50000)
	{
		discount=(amt*0.5);
		finalamt=amt-discount;
		System.out.println("your discount is"+discount);
		System.out.println("your payable amt is "+finalamt);
		
	}
	else
	{
		System.out.println("your amt is beyound the limit");
	}
	}

}
