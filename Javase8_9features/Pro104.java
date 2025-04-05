package Javase8_9features;
interface Demo2
{
	void test2();
	
}
class methodreference2
{
	public void get2()
	{
		System.out.println("this is non static method....");
	}
}
public class Pro104 {

	public static void main(String[] args) {
		methodreference2 r=new methodreference2();
		Demo2 d=r::get2;
		d.test2();
		

	}
}

