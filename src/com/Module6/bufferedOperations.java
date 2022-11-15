package com.Module6;

import java.io.*;


public class bufferedOperations {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("text\\sample.txt");
        BufferedReader bReader = new BufferedReader(fileReader);
        String line;
        while((line = bReader.readLine())!=null){
            System.out.println(line);
        }
    }

}
