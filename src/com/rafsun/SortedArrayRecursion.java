package com.rafsun;

public class SortedArrayRecursion {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 5, 7};
        System.out.println(sorted(arr, 0));

    }

    static boolean sorted(int[] arr, int index)
    {
        if(index == arr.length-1)
        {
            return true;
        }

        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
