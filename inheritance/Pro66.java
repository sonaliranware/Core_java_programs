package inheritance;
//method overriding
abstract class Vehical2
{
	void speed(int a)
	{
		System.out.println("parent class speed is "+a);
	}
	abstract void color();
}
class car2 extends Vehical2

{
	void speed(int a)
	{
		System.out.println("child class speed is "+a);
	}

	@Override
	void color() {
		System.out.println("white color");
		
	}
}
public class Pro66 {

	public static void main(String[] args) {
		/*car2 c=new car2();
		c.speed(10);
		c.color();*/
		//upcasting-----
		Vehical2 v=new car2();
		v.speed(10);
		//downcasting........
		//car2 c=new Vehical2()----this is not possible.....
		Vehical2 v1=new car2();  //paretclass_name objname=new childclass_name
		car2 c=(car2)v1; //childclassname oj=(typecast by childclass)childclass_object
		c.speed(20);
		c.color();

	}

}
