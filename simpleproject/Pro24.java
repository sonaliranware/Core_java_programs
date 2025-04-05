package simpleproject;
/*according to  i/p check given character is vowels or consonant*/
import java.util.Scanner;

 public class Pro24 {

	public static void main(String[] args) {
		char n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		n=sc.next().charAt(0); //accept single character
		switch(n)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println("vowels....");
	       break;
	    default:System.out.println("consonant");   
		}

	}

}
