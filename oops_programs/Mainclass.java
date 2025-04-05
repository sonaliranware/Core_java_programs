package oops_programs;

import java.util.Scanner;

import Package_project.operations;

public class Mainclass {

	public static void main(String[] args) {
		operations p=new operations();
		System.out.println("***welcome in simple calcualtor......");
		System.out.println("1.sum operation");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice<=5)
		{
			System.out.println("enter your choice");
			choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			   System.out.println("addition is "+p.add(10,20));
			   break;
		case 2:
			   System.out.println("addition is "+p.sub(10,20));
			   break;
		case 3:
			   System.out.println("addition is "+p.mul(10,20));
			   break;
		case 4:
			   System.out.println("addition is "+p.div(10,20));
			   break;
		case 5:
			    System.exit(0);
			   break;
		 default:
			   System.out.println("invalid i/p ");
			   
		}
	}
	}

}
