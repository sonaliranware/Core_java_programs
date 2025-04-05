package simpleproject;
//increment and decrement operator---
public class Pro11 {
public static void main(String[] args) {
int x=10;
System.out.println(x);  //10
System.out.println(++x); //pre-increment--11

System.out.println(x++);//post-increment---11
System.out.println(x);  //12
System.out.println("decrement--------");
int y=10;
System.out.println(y); //10
System.out.println(--y); //9

System.out.println(y--);//9
System.out.println(y);  //8

System.out.println(x);
System.out.println(y);
int r1=y-x+x-y;  //(8-12)+(12-8)   -4+4
System.out.println(r1);

















	}

}
