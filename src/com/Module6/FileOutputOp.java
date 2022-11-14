package com.Module6;
import java.io.*;
public class FileOutputOp {
    public static void main(String[] args) {
        try{

            FileOutputStream fout = new FileOutputStream("text\\outputFile.txt");
            String s = "This is Java's File Output Stream";
            // FOS is byte oriented so convert str to byte
            byte [] content = s.getBytes();
            fout.write(content);
            System.out.println("Written content");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
