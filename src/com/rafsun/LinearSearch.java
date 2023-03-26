package com.rafsun;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 18, 55, 66, 32, 54, 47, 78};
        int target = 54;
        int ans = Leaner(arr, target);
        System.out.println("Target found at Index number: "+ans);

        //Leaner search program to get index of target value in an array
    }

    static int Leaner(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
