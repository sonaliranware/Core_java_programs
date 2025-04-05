package JavaFinalProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MenuList implements DAOFile{

	@Override
	public void Menu1() {
		
		System.out.println("1:Place_Order");
		System.out.println("2:Edit Your Order");
		System.out.println("3:Display Your Order");
		
		System.out.println("4:Exit");
		System.out.println("****************************");
		
		
	}

	@Override
	public void Place_order() {
		try
		{
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_order","root","root");
		    PreparedStatement ps=con.prepareStatement("insert into myorder values(?,?,?)");
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter order id");
		    int oid=sc.nextInt();
		    System.out.println("enter item name");
		    String itemname=sc.next();
		    System.out.println("enter quantity");
		    int quantity=sc.nextInt();
		    ps.setInt(1, oid);
		    ps.setString(2,itemname);
		    ps.setInt(3,quantity);
		    int i=ps.executeUpdate();
		    System.out.println(i+"record inserted sucessfully.....");
		    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("**************************");
		
	}

	@Override
	public void Edit_order() {
		try
		{
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//creating connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_order","root","root");
	    PreparedStatement ps=con.prepareStatement("update myorder set itemname=? , quantity=? where oid=?");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter item name");
	    String itemname=sc.next();
	    System.out.println("enter quantity");
	    int quantity=sc.nextInt();
	    System.out.println("enter order id");
	    int oid=sc.nextInt();
	    ps.setString(1,itemname);
	    ps.setInt(2,quantity);
	    ps.setInt(3, oid);
	    int i=ps.executeUpdate();
	    System.out.println(i+"update record sucessfully.....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("*************************");
	}
	

	@Override
	public void Dispaly() {
	System.out.println("*******************");
	try
	{
	//register driver
		System.out.println("your  Data is :");
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_order","root","root");
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select * from myorder");
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		    }
		    
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("*******************");
	}
	
	
	

}
