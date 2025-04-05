package inheritance;
/*class declared by abstarct keyword
 * it contains abstract and non abstarct method
 * so we cant create object of an abstarct class
 */
abstract class Bank
{
	void  ROI()
	{
		System.out.println("6.5"); //non-abstarct method
	}
	abstract void deposit();    //abstract method
}
class SBIBank extends Bank
{
  @Override
	void deposit() {
	System.out.println("2,5 deposit value....");
		
}
	}
public class Pro61 {

	public static void main(String[] args) {
		SBIBank s=new SBIBank();
		s.deposit();
		s.ROI();

	}

}
