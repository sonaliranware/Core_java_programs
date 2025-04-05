package inheritance;
//member inner class/nested class
class Outerclass
{
	private int n=10;
	class innerclass
	{
		public void get()
		{
			System.out.println(n);
		}
	}
}

public class Pro67 {

	public static void main(String[] args) {
		
Outerclass ot=new Outerclass();
Outerclass.innerclass in=ot.new innerclass();
in.get();
	}

}
