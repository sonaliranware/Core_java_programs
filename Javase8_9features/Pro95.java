package Javase8_9features;
//interface that having single abstract method ---functional interface

interface myinterface
{
	void get();  //SAM    
	default void get2()
	{
		System.out.println("hi this implemented method...");
	}
}
public class Pro95  implements myinterface{
	@Override
	public void get() {
		System.out.println("this is single abstract method");
		
	}

	public static void main(String[] args) {
		 Pro95   p=new  Pro95  ();
		 p.get();
		 p.get2();

	}

	

}
