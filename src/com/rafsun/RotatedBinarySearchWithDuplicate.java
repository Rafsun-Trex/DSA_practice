package com.rafsun;

public class RotatedBinarySearchWithDuplicate {
    public static void main(String[] args) {
            int[] arr = {6, 7, 7, 1, 2, 3, 4, 5};
            int ans = search(arr, 3);
            System.out.println(ans);
    }
    static int search(int[] nums, int target)
    {
        int pivot = findPivot(nums);
        if(pivot == -1)
        {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target)
        {
            return pivot;
        }
        if(target >= nums[0])
        {
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    static int binarySearch(int[] nums, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
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
