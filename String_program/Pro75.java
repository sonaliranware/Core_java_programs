package String_program;

public class Pro75 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("itv");
		sb.append("thane");    //string buffer create mutable string
		System.out.println(sb);
		System.out.println(sb.capacity());//16+8    32+length
		System.out.println(sb.charAt(0));
		System.out.println(sb.reverse());
		System.out.println(sb.insert(0, 'h'));
		System.out.println(sb.delete(0, 4));
	    System.out.println(sb.length());
	    
	    System.out.println("using string builder...............");
	    
	    StringBuilder sb1=new StringBuilder("itv");
		sb.append("thane");    //string buffer create mutable string
		System.out.println(sb1);
		System.out.println(sb1.capacity());//16+8    32+length
		System.out.println(sb1.charAt(0));
		System.out.println(sb1.reverse());
		System.out.println(sb1.insert(0, 'h'));
		System.out.println(sb1.delete(0, 4));
	    System.out.println(sb1.length());

	}

}
