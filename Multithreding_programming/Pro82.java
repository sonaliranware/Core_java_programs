package Multithreding_programming;
class A extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("this is demon thread....");
		}
		else
		{
			System.out.println("this is user thread...");
		}
	}
}
public class Pro82 {

	public static void main(String[] args) {
		A a=new A();
		A a1=new A();
		a.setDaemon(true);
		a.start();
		a1.start();
	}

}
