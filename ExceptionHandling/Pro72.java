package ExceptionHandling;
//try with finally----
public class Pro72 {

	public static void main(String[] args) {
		System.out.println("start....");
		try
		{
	int result=10/0;
	System.out.println(result);
		}
		/*catch(Exception e)
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("hey i am finally block.....");
		}
	System.out.println("done");

	}

}
