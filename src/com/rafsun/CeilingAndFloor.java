package com.rafsun;

public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {-5,-2,-1,0,1,5,10,12,14,16,19,25,44};
        int target = 17;
        System.out.println("Ceiling index of target : "+ceiling(arr, target)+" Answer : "+arr[ceiling(arr, target)]);
        System.out.println("Floor index of target : "+floor(arr, target)+" Answer : "+arr[floor(arr, target)]);
    }

    static int ceiling(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        if(target>arr[arr.length-1])
        {
            return -1;
        }

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return start;
    }
    static int floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        if(target<arr[start])
        {
            return -1;
        }

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return end;
    }
}
