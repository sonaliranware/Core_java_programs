package oops_programs;
class employee
{
	int id;
	String name;
	double salary;
	employee(int id,String name,double salary) //parameterized constructor....
	
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void disp()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}
public class Pro53 {

	public static void main(String[] args) {
		employee e=new employee(100,"ram",3423.55);
		e.disp();
		
	}

}
