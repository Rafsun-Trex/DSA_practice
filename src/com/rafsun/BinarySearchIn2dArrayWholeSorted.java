package com.rafsun;

import java.util.Arrays;

public class BinarySearchIn2dArrayWholeSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160}
        };

        System.out.println(Arrays.toString(search(matrix, 110)));

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target)
    {
        while(cStart <= cEnd)
        {
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target)
            {
                return new int[] {row, mid};
            }
            if(matrix[row][mid] > target)
            {
                cStart = mid + 1;
            }
            else
            {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;

        if(row == 1)
        {
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;

        while(rStart < (rEnd-1))
        {
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid]==target)
            {
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid]<target)
            {
                rStart = mid;
            }
            else
            {
                rEnd = mid;
            }
        }

        if(matrix[rStart][cMid] == target)
        {
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target)
        {
            return new int[]{rStart+1, cMid};
        }

        if(target <= matrix[rStart][cMid-1])
        {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1])
        {
            return binarySearch(matrix, rStart, cMid+1, col-1, target);
        }
        if(target <= matrix[rStart+1][cMid-1])
        {
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        else
        {
            return binarySearch(matrix, rStart+1, cMid+1, col-1, target);
        }
    }
}
