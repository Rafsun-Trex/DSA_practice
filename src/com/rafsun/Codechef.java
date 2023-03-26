package com.rafsun;

import java.util.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for(int i=0; i<t; i++) {


            int n = read.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = read.nextInt();
            }
            Arrays.sort(arr);

            double ans = 0;

            for (int j = 1; j < n-1; j++) {
                ans = ans + (double) arr[j];
            }

            ans = ans/(n-2);


        }
    }
}