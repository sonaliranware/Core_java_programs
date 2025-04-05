package oops_programs;
class Products
{
	int pid;
	String pname;
	int quantity;
	void getdata(int i,String n,int q)
	{
		pid=i;
		pname=n;
		quantity=q;
	}
	void disp()
	{
		System.out.println("id is "+pid);
		System.out.println("name is "+pname);
		System.out.println("quantity is "+quantity);
	}
}
public class Pro51 {

	public static void main(String[] args) {
		Products p=new Products();
		p.getdata(100,"mobile",5);
		p.disp();

	}

}
