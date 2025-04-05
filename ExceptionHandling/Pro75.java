package ExceptionHandling;

public class Pro75 {
	static void checkage(int age)throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException ("invalid age for vote.....");
		}
		else
		{
			System.out.println("you are valid for vote....");
		}
	}

	public static void main(String[] args) {
		try
		{
			checkage(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
