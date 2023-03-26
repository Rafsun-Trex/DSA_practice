package com.rafsun;

public class LinearSearchMaxMin {
    public static void main(String[] args) {
        int[] arr = {8,4,7,17,12,15,19,20,54,66,2};

        System.out.println("Max : "+max(arr));
        System.out.println("Min : "+min(arr));

    }

    static int max(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}
