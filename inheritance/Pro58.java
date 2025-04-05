package inheritance;

import java.util.Scanner;

class employee
{
	int id;
	String name;
	int salary;
	
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter salary");
		salary=sc.nextInt();
		
	}
	void disp()
	{
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class contractemp extends employee
{
	int bonus;
	void get2()
	{
		get();
		System.out.println("enter bonus");
		bonus=sc.nextInt();
	}
	void disp2()
	{
		disp();
		System.out.println("bonus is"+bonus);
	}
}
public class Pro58 {

	public static void main(String[] args) {
		contractemp c=new contractemp();
		System.out.println("this is emp data");
		c.get();
		c.disp();
		System.out.println("this is contract emp data");
		c.get2();
		c.disp2();

	}

}
