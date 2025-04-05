package Multithreding_programming;
//creating class by extending thred class
//MAX_PRIORITY---10   MIN_PRIORITY---0   NORM_PRIORITY---5
class Demo5 extends Thread
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
class Demo6 extends Thread
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
}class Demo7 extends Thread
{
	public void run()
	{
	int i;
	for(i=11;i<=15;i++)
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
class Demo8 extends Thread
{
	public void run()
	{
	int i;
	for(i=100;i<=105;i++)
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
public class Pro80 {

	public static void main(String[] args) {
		Demo8 d4=new Demo8();
		d4.start();
		try
		{
			d4.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		Demo5 d=new Demo5();
		d.start();
		d.setPriority(Thread.MAX_PRIORITY);
		
		Demo6 d2=new Demo6();
		d2.start();
		d2.setPriority(Thread.MIN_PRIORITY);
		Demo7 d3=new Demo7();
		d3.start();
		d3.setPriority(Thread.NORM_PRIORITY);
		
	}

}
