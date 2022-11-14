package com.Module4;

interface DemoInterface{
    abstract void demoMethod();
    int legs = 12;
}
interface FirstInterface extends DemoInterface {
    public void myMethod(); // interface method
    public void demoMethod();
}

interface SecondInterface extends DemoInterface{

    public void myOtherMethod(); // interface method
    public void demoMethod();

}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }

    @Override
    public void demoMethod() {
        System.out.println("Hybrid Inheritance");
    }
}
public class hybridInheritance {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
        myObj.demoMethod();
    }
}