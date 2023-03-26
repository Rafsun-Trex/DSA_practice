package com.rafsun;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {4,5,2,1,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j > 0 ; j--) {
                {
                    if(arr[j]<arr[j-1])
                    {
                        swap(arr, j, j-1);
                    }
                    else
                    {
                        break;
                    }
                }

            }
        }
    }

    static void swap(int[] arr, int first, int second)
    {
        int swap = arr[second];
        arr[second] = arr[first];
        arr[first] = swap;

    }
}
