package java_collections;

public class Pro87 {

	public static void main(String[] args) {
		int a=10; //primitive data type
		
		Integer i=a;    //converting into objects by explicilty(done by compiler)
		Integer j=Integer.valueOf(a);  //converting into objects by implicitly 
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
		//wrapper class to primitive
		
		Integer l=new Integer(50); ////value stored in objects
		int k=l;    //converting objects to premitive data types
		int s=l.intValue();
		System.out.println(l);
		System.out.println(k);
		System.out.println(s);
		
		
	}

}
