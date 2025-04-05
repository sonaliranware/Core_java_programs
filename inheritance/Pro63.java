package inheritance;
interface A1
{
	void add();
}
interface B1
{
	void add();
	void sub();
	
}
class Test2 implements A1,B1
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
public class Pro63 {

	public static void main(String[] args) {
		Test2 t=new Test2();
		t.add();
		t.sub();

	}

}
