package ExceptionHandling;
//handling multiple exceptions.....
public class Pro73 {
public static void main(String[] args) {
		try
		{
			int r1=10/0;
			System.out.println(r1);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e2)
		{
			System.out.println(e2);
		}
		try
		{
			int a[]=new int[10];
			System.out.println(a[20]);
		}
		catch(Exception e3)
		{
			System.out.println(e3);
		}
		finally
		{
			System.out.println("finally block....");
		}

	}

}
