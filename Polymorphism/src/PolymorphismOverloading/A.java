package PolymorphismOverloading;

public class A {
	
	public void m1() {
		System.out.println("Inside m1-non parameterized");
		
		}
	
	public void m1(int i) {
		System.out.println(i);
		
	}
	
	public void m1(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	
	public void m1(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		A a=new A();
		
		a.m1();
		a.m1(10);
		a.m1(10,20);
		a.m1("Namrata");
	}
	

}
