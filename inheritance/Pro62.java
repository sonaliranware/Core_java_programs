package inheritance;
interface A
{
	void add();
	void sub();
	public static final int a=10;
	public default void get()
	{
		System.out.println("this is get method");
		
	}
	public static void show()
	{
		System.out.println("this is show method....");
	}
}
class Test implements  A
{

	@Override
	public void add() {
		System.out.println("this is addition method");
		
	}

	@Override
	public void sub() {
	System.out.println("this is substraction method....");
		
	}
	
}
public class Pro62 {
public static void main(String[] args) {
	
		Test t=new Test();
		A.show();
		t.add();
		t.sub();
		t.get();

	}

}
