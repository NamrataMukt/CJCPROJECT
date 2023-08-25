package PolymorphismToString;

public class Test {
	
	public static void main(String[] args) {
		Student s1=new Student(1,"xyz");
		Student s2=new Student(2,"pqr");
		
		//System.out.println("rollno:-"+s1.rollno+"name:-"+s1.name);
		//System.out.println("rollno:-"+s2.rollno+"name:-"+s2.name);
		
		//Another way as below
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
