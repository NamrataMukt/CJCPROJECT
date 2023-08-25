package PolymorphismToString;

public class Student {
	
	int rollno;
	String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno=rollno;
		this.name=name;
	}
	
	@Override
	
	public String toString() {
		return "rollno:-"+rollno+"name:-"+name;
		
		
	}
	
	
		
		
	}


