package inheritance;
//default,static,private
interface mytest
{
	void show();
	default void get()
	{
		System.out.println("default method calling.....");
		get2();
	}
	static void get1()
	{
		System.out.println("static method calling.....");
		
	}
	private void get2()
	{
		System.out.println("private method calling.....");
	}
}
class testimp implements mytest
{

	@Override
	public void show() {
		System.out.println("this is show.....");
		
	}
	
}
public class Pro70 {

	public static void main(String[] args) {
		testimp t=new testimp();
		t.get();
		t.show();
		mytest.get1();

	}

}
