package simpleproject;

import java.util.Scanner;

//check password valid or not
public class Pro19 {

	public static void main(String[] args) {
	String password="admin";
	String userpass;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of user password");
	userpass=sc.next();
	if(password.equals(userpass))
	{
		System.out.println("valid user");
	}
	else
	{
		System.out.println("invalid user");
	}

	}

}
