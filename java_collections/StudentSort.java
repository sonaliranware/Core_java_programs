package java_collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {

	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();
		Student s=new Student(100,"ram","pune");
		Student s1=new Student(200,"sam","thane");
		Student s2=new Student(300,"amol","dehli");
		Student s3=new Student(400,"rohan","mumbai");
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		System.out.println(al);

	}

}
