package com.rafsun;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {4,5,2,1,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
         }
    }

    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max]<arr[i])
            {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second)
    {
        int swap = arr[second];
        arr[second] = arr[first];
        arr[first] = swap;

    }
}
