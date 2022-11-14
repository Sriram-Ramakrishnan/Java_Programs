package com.Module6;

import java.io.*;

public class FileInputOp {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream fin= new FileInputStream("text\\sample.txt");
            System.out.println("Contents:");
            int i = fin.read();
            while(i!=-1){
                System.out.print((char) i);
                i = fin.read();
            }
            System.out.println();
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
