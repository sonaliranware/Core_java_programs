package Javase8_9features;
/*lambda expression---helps for functional interface implementation
 * (argument_list)->{body}
 */
interface A
{
	void a();
}
public class Pro96  {

	public static void main(String[] args) {
		/*A obj=new A()
				{

					@Override
					public void a() {
						System.out.println("this is SAM...");
						
					}
			
				};
				obj.a();*/
		A obj=()->{System.out.println("this is SAM");};
		obj.a();

}
}
