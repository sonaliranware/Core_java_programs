package inheritance;
interface myinterface
{
	void show();
}
public class Pro69 {

	public static void main(String[] args) {
		myinterface m=new myinterface()
				{

					@Override
					public void show() {
						System.out.println("show method....");
						
					}
			
				};
				m.show();

	}

}
