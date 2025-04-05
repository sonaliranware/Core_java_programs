package Multithreding_programming;
class movieticket
{
	int totalticket=10;
	synchronized void ticketbook(int seat)
	{
		if(totalticket>seat)
		{
			System.out.println("sucessfully booked ticket....");
			totalticket=totalticket-seat;
			System.out.println("balance ticket is "+totalticket);
		}
		else
		{
			System.out.println("cant booked ticket...");
			System.out.println("remaining ticket only  "+totalticket);
		}
	}
}
public class Pro81 extends Thread {
	static movieticket m;
	int seat1;
	public void run()
	{
		m.ticketbook(seat1);
	}
	
	public static void main(String[] args) {
		 m=new movieticket();
		 Pro81 ram=new Pro81();
		 ram.seat1=18;
		 ram.start();
		 Pro81 sam=new Pro81();
		 sam.seat1=5;
		 sam.start();
		 
   
	}

}
