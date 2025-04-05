package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employeesortmain {

	public static void main(String[] args) {
	ArrayList<Employee>al=new ArrayList<Employee>();
	Employee e1=new Employee(100,"ram",45465);
	Employee e2=new Employee(200,"sam",95465);
	Employee e3=new Employee(700,"amol",55465);
	Employee e4=new Employee(800,"pooja",35465);
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice");
	s=sc.next();
	if(s.equals("SortByName"))
	{
		Collections.sort(al,new SortByName());
	}
	else
	{
		Collections.sort(al,new SortById());
	}
	System.out.println(al);

	}

}
