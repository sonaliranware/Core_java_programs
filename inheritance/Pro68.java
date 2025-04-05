package inheritance;
//static nested class 
class outer
{
	static int a=10;
	static class inner
	{
		static void get()
		{
			System.out.println(a);
		}
	}
}
public class Pro68 {

	public static void main(String[] args) {
		outer.inner in=new outer.inner();
		in.get();

	}

}
