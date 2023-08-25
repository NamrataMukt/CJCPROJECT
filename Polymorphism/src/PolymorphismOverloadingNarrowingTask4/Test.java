package PolymorphismOverloadingNarrowingTask4;

public class Test{
 	
	public void m1(A a){
		System.out.println("In A parameter");
	}
	public void m1(B b){
		System.out.println("In B parameter");
	}
	public void m1(C c){
		System.out.println("In C parameter");
	}
	public static void main(String[] args) {
	Test t=new Test();
	t.m1(null);
	t.m1((A)null);
	t.m1((B)null);
   }
}

//In C parameter
//In A parameter
//In B parameter