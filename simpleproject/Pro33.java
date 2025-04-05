package simpleproject;

import java.util.Scanner;

//check given number is armstrong number number
//153---1+125+27=153
public class Pro33 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();//153
	int temp=n;
	int rem;
	int sum=0;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem*rem*rem;
		n=n/10;
		
	}
	if(temp==sum)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("not Armstrong");
	}


	}

}
