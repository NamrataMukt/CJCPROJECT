package PolymorphismOverloadingNarrowing;

public class A {
	
	public void m1(String s) {
		System.out.println(s);
		System.out.println("inside string parameter");
		
	}
	
	public void m1(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m1(null);
	}
}
