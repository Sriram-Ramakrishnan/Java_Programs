package com.Module1;
/*
    Perform using Switch case - Get a number from 1 to 3 as input from the user.
    If the user enters 1 display “one”,
    if the input is 2 then display “two”
    if the input is 3 then display “three”.
    For any other input display “ Wrong Input”
* */
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any number from 1 to 3:");
        a = sc.nextInt();
        switch (a){
            case 1:{
                System.out.println("one");
                break;
            }
            case 2:{
                System.out.println("two");
                break;
            }
            case 3:{
                System.out.println("three");
                break;
            }
            default:{
                System.out.println("Wrong Input");
                break;
            }
        }
    }
}
