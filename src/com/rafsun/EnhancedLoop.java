package com.rafsun;

import java.util.Arrays;
import java.util.Scanner;

public class EnhancedLoop {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");     // traditional
//        }

//        for(int num:arr)
//        {
//            System.out.print(num+" ");     //Enhanced
//        }

        System.out.println(Arrays.toString(arr));  //best one to print all elements of an array

    }
}
