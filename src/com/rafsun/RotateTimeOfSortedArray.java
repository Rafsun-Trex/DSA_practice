package com.rafsun;

public class RotateTimeOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};
        int ans = findPivot(arr);
        System.out.println(ans+1);
    }
    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;
            //four cases to find pivot in rotated sorted array
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            //handle duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                if(arr[start] > arr[start+1])
                {
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1])
                {
                    return end - 1;
                }
                end--;
            }
            else if(arr[mid] > arr[start] || (arr[start] == arr[mid]  &&  arr[mid] > arr[end]))
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }

}
