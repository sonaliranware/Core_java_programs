package inheritance;
//method overloading................
class Calculations
{
	int add(int a,int b)
	{
	  return a+b;
	}
	int add(int a,int b ,int c)
	{
	  return a+b+c;
	}
}

public class Pro65 {

	public static void main(String[] args) {
		 Calculations c=new  Calculations();
		System.out.println("calling first method"+( c.add(10, 20))); 
		System.out.println("calling second method"+( c.add(10, 20,30))); 
		  

	}

}
