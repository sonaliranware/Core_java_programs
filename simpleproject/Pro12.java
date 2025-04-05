package simpleproject;
//bitwise operator---- &  |
public class Pro12 {

	public static void main(String[] args) {
		int a=10 ,b=4;
		System.out.println("bitwise and "+(a & b));
		/*
		 * 10-----1 0 1 0
		 * 4------0 1 0 0
		 * ----------------
		 *        0 0 0 0 ------decimal 0
		 */
		System.out.println("bitwise or "+(a | b));
	}

}
