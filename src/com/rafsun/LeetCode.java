package com.rafsun;

public class LeetCode {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'e'};
        char target = 'f';
        System.out.println(peakIndexInMountainArray(arr,target));
    }
    static public char peakIndexInMountainArray(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;


        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }

        }
        return arr[start % arr.length];

    }



}
