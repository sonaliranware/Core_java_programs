package simpleproject;
/*looping--used to execute a set of instructions repeatedly when certain conditions
 *  become true.
Example searching for a name in a list until and unless the name is found.
There are three types of loops in Java.
for loop
While loop
Do while loop*/
//for loop is used when we know the number of iterations.
/*syntax:
 * for(initilization;condition;incre/dcre){
 * statement;}
 */
//to print 1 to 10 numbers
public class Pro25 {

	public static void main(String[] args) {
		int i;
		/*for(i=1;i<=10;i++)   //i++---i=i+1
		{
			System.out.println(i);
		}*/
		for (i=10;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
