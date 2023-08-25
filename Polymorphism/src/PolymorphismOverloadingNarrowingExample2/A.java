package PolymorphismOverloadingNarrowingExample2;

public class A {
	
	public void m1(A a) {
		
		System.out.println("inside m1--A");
	}
	
public void m1(String s) {
		
		System.out.println("inside m1--String");
	}

public static void main(String[] args) {
	A a=new A();
	//a.m1(null);//The method m1(A) is ambiguous for the type A
	a.m1((A)null);//Type Casting
}

}
