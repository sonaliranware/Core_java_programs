package Multithreding_programming;
//creating class which is implemented by Runnable interface
class Demo2  implements Runnable
{
	public void run()
	{
	 System.out.println("this is run method.....");	
	}
}
public class Pro79 {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		Thread t=new Thread(d);
		t.start();

	}

}
