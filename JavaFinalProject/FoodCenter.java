package JavaFinalProject;

import java.util.Scanner;

public class FoodCenter {
	
	public static void main(String[] args) {
		System.out.println("****Welcome in MyCafe********");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Name");
		String name=sc.next();
		System.out.println("enter your address");
		String address=sc.next();
		System.out.println("enter your mobile number");
		long mob=sc.nextLong();
		MenuList m=new MenuList();
		int choice;
		do
		{
		     m.Menu1();	
		     System.out.println("Choose your option");
		     choice=sc.nextInt();
		     switch(choice)
		     {
		     case 1:m.Place_order();
		            break;
		     case 2:m.Edit_order();
		            break;
		     case 3:m.Dispaly();
		            break;
		     case 4:System.exit(0);
		            break;
		     default:
		    	 System.out.println("invalid choice....");
		           
		     }
		  }while(choice<=4);
		
		

	}

}
