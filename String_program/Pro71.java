package String_program;

public class Pro71 {

	public static void main(String[] args) {
		String s="itvedant";    //by using string literal
		System.out.println(s);
		String s1=new String("education");//by using new keyword....
		System.out.println(s1);
		//how we can check imuutable string?
		s.concat("thane");
		System.out.println(s); //beacuse string immutable so cant change string it print orignal string itvedant
		//how we can make mutable
		s=s.concat("thane");
		System.out.println("mutable string is "+s);

	}

}
