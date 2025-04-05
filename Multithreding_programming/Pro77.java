package Multithreding_programming;
//creating class by extending thred class
class Demo extends Thread
{
	public void run()
	{
	 System.out.println("this is run method.....");	
	}
}
public class Pro77 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.start();

	}

}
