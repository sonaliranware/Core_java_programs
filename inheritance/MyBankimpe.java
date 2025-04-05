package inheritance;

import java.util.Scanner;

class SBI implements MyBank
{
	String name,address;
	int amt,accountno;
	double balance=1000.0;
	Scanner sc=new Scanner(System.in);
	

	@Override
	public void getdata() {
		System.out.println("enter  name");
		name=sc.next();
		System.out.println("enter address");
		address=sc.next();
		System.out.println("enter accountno");
		accountno=sc.nextInt();
		}

	@Override
	public void withdraw() {
		System.out.println("enter  your withdraw amount");
		amt=sc.nextInt();
		balance=balance-amt;
		System.out.println("after withdraw your balance is "+balance);
		
	}

	@Override
	public void deposite() {
		System.out.println("enter  your deposite amount");
		amt=sc.nextInt();
		balance=balance+amt;
		System.out.println("after deposite your balance is "+balance);
		
	}

	@Override
	public void display() {
		System.out.println("name is "+name);
		System.out.println("address is"+address);
		System.out.println("account no is"+accountno);
		System.out.println("final balance is"+balance);
		
		
	}
	
}
class Axis extends SBI
{
	public void get2()
	{
		getdata();
	}
	public void withdraw2()
	{
		withdraw();
	}
	public void deposite2()
	{
		deposite();
	}
	public void disp2()
	{
		display();
	}
	
}


public class MyBankimpe {

	public static void main(String[] args) {
		Axis a=new Axis();
		System.out.println("accessing data for SBI bank");
		a.getdata();
		a.withdraw();
		a.deposite();
		a.display();
		System.out.println("accessing data for Axis bank");
		a.get2();
		a.withdraw2();
		a.deposite2();
		a.disp2();

	}

}
