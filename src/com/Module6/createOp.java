package com.Module6;
import java.io.*;
public class createOp {
    public static void main(String[] args) throws IOException {
        // Streams are flows of Data, you can read and write stream
        /**
         * Input and output stream -> Byte Oriented
         * reader and writer -> Character oriented
         *
         */
        // Creating a folder:
        File file = new File("text");
        file.mkdir();
        // Creating a subfolder:
        file = new File("text\\subtext");
        file.mkdir();

        // Create a file:
        File file1 = new File("text\\sample.txt");
        if(!file1.exists()) {
            file1.createNewFile();
            System.out.println("Created");
        }else {
            System.out.println("Already Exists");
        }
    }
}
