package ExceptionHandling;
//try with catch 
public class Pro71 {

	public static void main(String[] args) {
		System.out.println("start....");
		try
		{
	int result=10/0;
	System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	System.out.println("done");

	}

}
