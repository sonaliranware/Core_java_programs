package inheritance;
abstract class A2
{
	abstract void add();
}
interface B2
{
	void add();
	void sub();
	
}
class Test3  extends A2 implements B2
{

	@Override
	public void sub() {
		int a=10,b=5;
		int res=a-b;
		System.out.println("sub is "+res);
		
	}

	@Override
	public void add() {
		int a=10,b=5;
		int res=a+b;
		System.out.println("sub is "+res);
		
	}
	
}
public class Pro64 {

	public static void main(String[] args) {
		Test3 t=new Test3();
		t.add();
		t.sub();

	}

}
