package String_program;

import java.util.Scanner;

//string reverse without using reverse function......
public class Pro74 {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		s=sc.next();
		String temp=s;
		String res="";
	
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
			
		System.out.println("reverse string is "+res);
		
       if(temp.equals(res))
       {
    	   System.out.println("palindrome");
       }
       else
       {
    	   System.out.println("not palindrome");
       }
	}

}
