package com.rafsun;

import java.util.Arrays;

public class MaxinArray {
    public static void main(String[] args) {
        int[] arr = {4, 88, 2, 4, 9, 50, 80};

        System.out.println(max(arr));
    }


    static int max(int[] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
