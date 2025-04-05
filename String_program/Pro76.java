package String_program;

import java.util.Scanner;

//Write a program to find  the number of vowels and consonant in the given String
public class Pro76 {

	public static void main(String[] args) {
		String str;
		System.out.println("enter your string");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int v=0;
		int c=0;
		int i;
		for(i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				v++;
			}
			else
			{
			c++;	
			}
		}
		System.out.println("number of vowels "+v);
		System.out.println("number of consonant "+c);


	}

}
