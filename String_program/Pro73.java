package String_program;
//string comparision done vy 3 ways--1) equals  2)== 3)compareTo()
public class Pro73 {

	public static void main(String[] args) {
	String s="itvedant";  //scp
	String s1=new String("itvedant");//heap
	String s2="iTVEDANT";//scp
	String s4="itvedant";//scp
	String s5=new String("itvedant"); //heap
	String s6="thane";//scp
	System.out.println("by using equals..............");
	System.out.println(s.equals(s1));
	System.out.println(s.equals(s2));
	System.out.println(s.equalsIgnoreCase(s2));
	
	System.out.println("by using == symbol"); //depends on memory mgnt 
	System.out.println(s==s1);//false
	System.out.println(s==s2);//false
	System.out.println(s==s4);//true
	System.out.println(s1==s5);//false
	
	System.out.println("by using compareTo().............."); //works based on ASCII value
	System.out.println(s.compareTo(s1));//0
	System.out.println(s.compareTo(s2));//32 itvedant---ITVEDANT 105-73 --32
	System.out.println(s.compareTo(s6));//-11 --i  t    (105-116)===-11
	

	}

}
