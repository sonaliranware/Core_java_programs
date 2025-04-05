package inheritance;
//multilevel inheritance
class Vehical
{
	void speed()
	{
		System.out.println("speed 100");
	}
	
}
class car extends Vehical
{
	void color()
	{
		System.out.println("color is white...");
	}
}
class Auto extends car
{
	void price()
	{
		System.out.println("232434");
	}
}

public class Pro59 {

	public static void main(String[] args) {
		Auto a=new Auto();
		a.speed();
		a.color();
		a.price();

	}

}
