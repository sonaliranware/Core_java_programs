package ExceptionHandling;

import java.util.Scanner;

class passwordinvalid extends Exception
{
	public passwordinvalid(String s)
	{
		super(s);
	}
}
public class Pro76 {
	static void checkpassword(String pass)throws passwordinvalid
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
		String password=sc.next();
		if(password.equals(pass))
		{
			System.out.println("sucessfully login.....");
		}
		else
		{
			throw new passwordinvalid("incorrect password....");
		}
	}

	public static void main(String[] args) {
		try
		{
			checkpassword("admin");
		}
		catch(passwordinvalid e)
		{
			System.out.println(e);
		}
		
	}

}
