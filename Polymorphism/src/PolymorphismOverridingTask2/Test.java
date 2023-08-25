package PolymorphismOverridingTask2;

public class Test{
	   
	public static void main(String args[]){
	      Animal a = new Animal();
		    a.move();   
	      
		  Animal b = new Dog();//method running starts from constructor class means here from Dog so method move will execute from Dog class.
	        b.move(); 
	   }
	}
