package PolymorphismOverridingTask1;

public class Test{ 
    public static void main(String[] args) { 
    Parent p = new Parent();
    p.diplay();
    //p.m1();//m1 is private method so can not access in another class
    p.m2();
    //p.m3();m3 is a static method so need to call this using class name as below line
    Parent.m3();
    Parent p1 = new Child(); 
    p1.diplay(); 
   // p1.m1();//m1 is private method
    p1.m2();
    //p1.m3();
    Child.m3();
    } 
} 

