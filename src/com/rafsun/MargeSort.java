package com.rafsun;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,8,1,5,2,4};
        int[] sortarr = marge(arr);

        System.out.println(Arrays.toString(sortarr));

    }

    static int[] marge(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length / 2;

        int[] firstHalf = marge(Arrays.copyOfRange(arr, 0, mid));
        int[] secondHalf = marge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeAll(firstHalf, secondHalf);
    }

    private static int[] mergeAll(int[] firstHalf, int[] secondHalf) {
        int[] all = new int[firstHalf.length + secondHalf.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<firstHalf.length && j< secondHalf.length) {
            if (firstHalf[i] < secondHalf[j]) {
                all[k] = firstHalf[i];
                i++;
            } else {
                all[k] = secondHalf[j];
                j++;
            }
            k++;
        }


            while(i< firstHalf.length)
            {
                all[k] = firstHalf[i];
                i++;
                k++;
            }
            while(j< secondHalf.length)
            {
                all[k] = secondHalf[j];
                j++;
                k++;
        }

        return all;
    }
}
