package com.rafsun;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {-5,-2,-1,0,1,5,10,12,14,16,19,25,44};
        int[] arr = {44,25,19,16,14,12,10,5,1,0,-1,-2,-5};
        int target = 5;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        boolean issAsc = arr[start] < arr[end];

        if(issAsc)
        {
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
        }

        else
        {
            while(start <= end)
            {
                int mid = start + (end - start)/2;
                if(target > arr[mid])
                {
                    end = mid - 1;
                }
                else if(target < arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    return mid;
                }
            }
        }

        return -1;
    }
}

