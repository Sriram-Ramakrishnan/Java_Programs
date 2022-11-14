package com.Module6;

import java.io.*;

public class FileInputOp {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream fin= new FileInputStream("text\\sample.txt");
            System.out.println("Contents:");
            int count = fin.available();
            System.out.println("\nAvailable Bytes before reading:"+count);
            int i = fin.read();
            while(i!=-1){
                System.out.print((char) i);
                i = fin.read();
            }
            count = fin.available();
            System.out.println("\nAvailable Bytes after reading:"+count);
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
