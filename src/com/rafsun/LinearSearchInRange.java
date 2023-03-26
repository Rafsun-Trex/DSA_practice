package com.rafsun;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 18, 55, 66, 32, 54, 47, 78};
        int target = 54;
        int ans = Leaner(arr, target, 2, 5);
        System.out.println(ans);

        //Leaner search program to get index of target value in an array
    }

    static int Leaner(int[] arr, int target, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
