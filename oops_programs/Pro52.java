package oops_programs;
class Products1
{
	int pid;
	String pname;
	int quantity;
	void getdata(int pid,String pname,int quantity)
	{
		this.pid=pid;
		this.pname=pname;
		this.quantity=quantity;
	}
	void disp()
	{
		System.out.println("id is "+pid);
		System.out.println("name is "+pname);
		System.out.println("quantity is "+quantity);
	}
}
public class Pro52 {

	public static void main(String[] args) {
		Products1 p=new Products1();
		p.getdata(100,"mobile",5);
		p.disp();

	}

}
