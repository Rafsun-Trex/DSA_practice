package com.rafsun;

public class UniqueInArrayUsingXOR {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,3,4,2,6,4};
        int unique = 0;
        for(int n : arr)
        {
            unique ^= n;
        }
        System.out.println(unique);
    }
}
