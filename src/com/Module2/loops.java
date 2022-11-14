package com.Module2;

import java.util.Arrays;

public class loops {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};


        /* For each loop:
         Similar to python's for x in arr */
        System.out.print("For Each: ");
        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println("");
        /* forEach function and mapToObj */
        System.out.print("For Loop: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        /* While loop */
        System.out.print("Normal While: ");
        int j = 0;
        while (j<arr.length){
            System.out.printf("%d ",arr[j]);
            j++;
        }
        System.out.println("");

        /* Do While loop */
        System.out.print("Do While: ");
        int k = 0;
        do {
            System.out.printf("%d ",arr[k]);
            k++;
        }while (k<arr.length);
        System.out.println("");

    }
}
