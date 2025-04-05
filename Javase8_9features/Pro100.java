package Javase8_9features;
//stream with filter function
import java.util.Arrays;

import java.util.List;
//Reference to a Static Method
interface Demo{  
    void say();  
}  
class MethodReference {  
    public  void saySomething(){  
        System.out.println("Hello, this is non static method.");  
    }
}
public class Pro100 {

	public static void main(String[] args) {

		
		 MethodReference  m=new  MethodReference ();
		 Demo d=m::saySomething;
		 d.say();
		

	}

}

