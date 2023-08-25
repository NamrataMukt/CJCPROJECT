package PolymorphismTask6;

//constructor overloading

public class A {
	
public A() {
	
	System.out.println("Constructor without parameter");
}

public A(int a) {
	
	System.out.println("Constructor with one parameter--int");
}

public A(int a, float f) {
	
	System.out.println("Constructor with two parameter");
}

public A(double d) {
	
	System.out.println("Constructor with one  parameter--double");
}

public static void main(String[] args) {
	A a=new A();
	A a1=new A(10);
	A a2=new A(11,11.3f);
	A a3=new A(33.33);
}
}
