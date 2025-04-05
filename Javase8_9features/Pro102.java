package Javase8_9features;
/*Method references---it is shortcut for calling method using functional interface
 * it is an alternative approch for lambda expression
3 ways---1)by using reference to static method 2) reference to an instance method 3)reference to a constructor
 */
//by using static method
interface Demo1
{
	void test();    //SAM
}
class Methodinterface
{
	public static void mytest()
	{
		System.out.println("this is static method......");
	}
}
public class Pro102 {

	public static void main(String[] args) {
		Demo1 d=Methodinterface::mytest;
		d.test();
		

	}

}
