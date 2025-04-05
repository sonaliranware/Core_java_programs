package simpleproject;
//logical operator--- &&,||,
public class Pro9 {

	public static void main(String[] args) {
		int a=10,b=20,c=2;
		//logical && if both i/p are true then its true
		//local or if both i/p false then its false
		System.out.println("*****logical and*****");
		System.out.println((a>b) &&(a>c));//f && T---->F
		System.out.println((a<b) &&(a<c));//T && F---->F
		System.out.println((a>b) &&(a<c));//f && F---->F
		System.out.println((a<b) &&(a>c));//T && T---->T
		System.out.println("*****logical or*****");
		System.out.println((a>b) ||(a>c));//f || T---->T
		System.out.println((a<b) ||(a<c));//T || F---->T
		System.out.println((a>b) ||(a<c));//f || F---->F
		System.out.println((a<b) ||(a>c));//T || T---->T
		System.out.println("****logical not*****");
        System.out.println(!((a<b) ||(a>c)));//T ||T--!(T)----F
	}

}
