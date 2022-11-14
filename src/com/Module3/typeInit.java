package com.Module3;

public class typeInit {
    int a = 0;
    // Static block works on class
    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }

    typeInit(){
        this.a = 20;
    }
    typeInit(int a){
        this.a = a;
    }
    // Instance block works on objects
    {
        // Also works before constructor so a = 0 here:
        System.out.println("Instance Initialised "+a);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        typeInit A = new typeInit();
        typeInit B = new typeInit(25);
        System.out.println(B.a);
    }
}
