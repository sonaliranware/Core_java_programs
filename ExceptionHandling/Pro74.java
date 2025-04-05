package ExceptionHandling;
//Exception Propagations------
class A
{
	void get()
	{
		int a=10/0;
		System.out.println(a);
	}
	void get2()
	{
		
			String s=null;
			System.out.println(s.length());
		
	}
	void get3()
	{
		get();
		get2();
	}
}
public class Pro74 {

	public static void main(String[] args) {
		A a=new A();
		try
		{
		a.get3();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
