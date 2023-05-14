package com.rafsun;

import java.util.Arrays;

public class TriangleRecursion {
    public static void main(String[] args) {
        //triangle2(4, 0);
        int[] arr = {7,5,8,4,1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int row, int col)
    {
        if(row == 0)
        {
            return;
        }

        if(col < row)
        {
            System.out.print("* ");
            triangle(row, col+1);
        }
        else
        {
            System.out.println();
            triangle(row-1, 0);
        }

    }

    static void triangle2(int row, int col)
    {
        if(row == 0)
        {
            return;
        }

        if(col < row)
        {

            triangle2(row, col+1);
            System.out.print("* ");
        }
        else
        {

            triangle2(row-1, 0);
            System.out.println();
        }

    }

    static void bubble(int[] arr, int r, int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            if(arr[c]>arr[c+1])
            {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;


            }

            bubble(arr, r, c+1);

        }
        else
        {
            bubble(arr, r-1, 0);
        }
    }
}
