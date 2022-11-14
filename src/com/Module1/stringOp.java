package com.Module1;


import java.util.Scanner;
import java.lang.*;
/* Write a Java program to accept two strings from user and perform the following operations: */
public class stringOp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //scan.nextLine(); -> Use before str input if getting int or double
        System.out.print("Enter String 1:");
        String s1 = scan.nextLine();
        System.out.print("Enter String 2:");
        String s2 = scan.nextLine();
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
        // a) Find the length of both input strings
        int l1 = s1.length(), l2 = s2.length();
        System.out.println("a) Lengths:"+l1+","+l2);
        // b)Concatenation of two strings
        String s12 = s1.concat(s2);
        System.out.println("b) Concatenated String:"+s12);
        // c) Convert s1 to Uppercase:
        s1 =  s1.toUpperCase();
        System.out.println("c) Uppercase s1:"+s1);
        // d) Check whether the given string is palindrome or not
        String sr =  ""; char ch;
        for (int i=0; i<s1.length(); i++)
        {
            ch= s1.charAt(i); //extracts each character
            sr= ch+sr; //adds each character in front of the existing string
        }
        System.out.print("d) ");
        if (s1.equals(sr)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
        // e) Find the number of upper case letters. (use isUpperCase() method)
        int c1 = 0;
        for (int i=0; i<s1.length(); i++)
        {
            ch= s1.charAt(i); //extracts each character
            if(Character.isUpperCase(ch)){
                c1++;
            }
        }
        System.out.println("e) Number of Uppercase Letters:"+c1);


    }
}
