package inheritance;
//Hierachical inheritance
class Vehical1
{
	void speed()
	{
		System.out.println("speed 100");
	}
	
}
class car1 extends Vehical1
{
	void color()
	{
		System.out.println("color is white...");
	}
}
class Auto1 extends Vehical1
{
	void price()
	{
		System.out.println("232434");
	}
}

public class Pro60 {

	public static void main(String[] args) {
      Auto1 a=new Auto1();
      a.speed();
      a.price();
     car1 c=new car1();
     c.color();
	}

}
