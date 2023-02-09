package com.Module5;

import java.io.File;
import java.io.IOException;


public class BuiltInExceptionsDemo {
    public static void divideByZero()
    {
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) throws IOException {
        // throws keyword is used to tackle any potential exception
        // In this case, IOException when file is created.
        File file1 = new File("text\\sample.txt");
        if(!file1.exists()) {
            file1.createNewFile();
            System.out.println("Created");
        }else {
            System.out.println("Already Exists");
        }
        try{
            int a[]=new int[5];
            a[8]=35;
            a[3]=2/0;
        }
        // We dont use Exception as it is the parent class of the above
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("Exception occurs "+e2);
        }
        System.out.println("rest of the code");
    }
}
