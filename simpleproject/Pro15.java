package simpleproject;

import java.util.Scanner;

//accept student details from user and display it
public class Pro15 {

	public static void main(String[] args) {
		System.out.println("welcome in student details application");
        String s_name,college_name;
        int roll_no,age;
        double marks;
        long mobno;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll_no");
        roll_no=sc.nextInt();
        System.out.println("enter student name");
        s_name=sc.next();
        System.out.println("enter collage name");
        college_name=sc.next();
        System.out.println("enter age ");
        age=sc.nextInt();
        System.out.println("enter marks");
        marks=sc.nextDouble();
        System.out.println("enter your contact details");
        mobno=sc.nextLong();
        System.out.println("your details is.........");
        System.out.println("roll_no "+roll_no);
        System.out.println("name is "+s_name);
        System.out.println("collage name "+college_name);
        System.out.println("age is "+age);
        System.out.println("marks is "+marks);
        System.out.println("contact details is"+mobno);
        
        
	}

}
