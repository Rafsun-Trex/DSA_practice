package com.rafsun;

import java.util.ArrayList;
import java.util.Arrays;

public class RecustionArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int target = 4;

        System.out.println( numb(arr, target, 0));
    }

    static ArrayList<Integer> numb(int[] arr, int target, int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length-1)
        {
            return list;
        }

        if(arr[index]== target)
        {
            list.add(index);
        }

        ArrayList<Integer> resultList = numb(arr, target, index+1);
        list.addAll(resultList);
        return list;

    }
}
