package com.Module1;

import java.util.Scanner;

public class ternaryOp {
    public static void main(String[] args) {
        System.out.print("Enter your mark:");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        // Ternary Operation syntax:
        // Condition ? if condition is true : if condition is false
        int mark1 = mark > 40 ? mark + 10 : mark + 20;
        System.out.println("Updated mark:" + mark1);
    }

}
