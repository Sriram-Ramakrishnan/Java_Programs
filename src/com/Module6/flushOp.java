package com.Module6;

import java.io.*;

public class flushOp {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("text\\flushFile.txt");
            String data = "Flushed the content to this text file flushFile.txt";
            byte o[] = data.getBytes();
            out.write(o);
            System.out.println("Written to file");
            // In case some bytes are left, flush() writes them:
            out.flush();
            System.out.println("Flushed content");
            out.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
