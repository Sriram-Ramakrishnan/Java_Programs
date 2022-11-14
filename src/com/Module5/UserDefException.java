package com.Module5;
import java.lang.*;
class MyException extends Exception {
    public MyException(String s){
        super(s);// Accesses the parent constructor -> Exception
    }
}
public class UserDefException {
    public static void main(String[] args) {
        try {
            // throw your exception
            throw new MyException("User Defined Exception");
        }
        catch (MyException e){
            System.out.println("My personal "+ e);
            System.out.println(e.getMessage());
        }
    }
}
