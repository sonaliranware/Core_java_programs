package java_collections;
//comparable interface----
public class Student implements  Comparable<Student> {
       int id;
       String name;
       String address;
       
	

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}



	@Override
	public int compareTo(Student o) {
		return this.address.compareTo(o.address);
	}
	

}
