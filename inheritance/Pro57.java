package inheritance;
class Father
{
	void house()
	{
		System.out.println("father house.....");
	}
}
class child extends Father   //class subclassname extends superclassname
{
	void car()
	{
		System.out.println("car....");
	}
}
public class Pro57 {

	public static void main(String[] args) {
		child c=new child();
		c.house();
		c.car();

	}

}
