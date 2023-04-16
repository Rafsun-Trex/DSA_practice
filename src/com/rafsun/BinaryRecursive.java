package com.rafsun;

public class BinaryRecursive {
    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 9, 65, 68, 110};
        int target = 66;
        System.out.println(search(arr, target, 0, arr.length-1));

    }

    static int search(int[] arr, int target, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m = s+(e-s)/2;

        if(target==arr[m])
        {
            return m;
        }
        else if(arr[m]>target)
        {
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
