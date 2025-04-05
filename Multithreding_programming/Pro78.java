package Multithreding_programming;
//creating class by extending thred class
class Demo1 extends Thread
{
	public void run()
	{
	char i;
	for(i='A';i<='E';i++)
	{
		try
		{
		  Thread.sleep(2000);
		  System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	}
}
class Demo4 extends Thread
{
	public void run()
	{
	int i;
	for(i=1;i<=5;i++)
	{
		try
		{
		  Thread.sleep(2000);
		  System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	}
}
public class Pro78 {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.start();
		Demo4 d2=new Demo4();
		d2.start();

	}

}
