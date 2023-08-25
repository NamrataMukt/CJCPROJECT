package PolymorphismTask3;

public class Test{
	public static void main(String[] args){ 
    		System.out.println("Normal main method"); 
    		Test.main("cjc"); //main method is static so we directly called by class name.
	} 
	public static void main(String arg1){ 
    		System.out.println("without array main method: " + arg1); 
    		Test.main("cjc", "classes"); 
	} 
	public static void main(String arg1, String arg2) { 
    		System.out.println("two paramerter main method: "+ arg1		+", "+arg2); 
	} 
}
//yes we can overload main method
/*Normal main method
without array main method: cjc
two paramerter main method: cjc, classes*/
