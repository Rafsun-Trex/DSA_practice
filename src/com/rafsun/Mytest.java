package com.rafsun;

import java.util.Scanner;

public class Mytest {
    public static void main(String[] args) {

        String str = "1100";
        int x;
        char ch;

        for (int i = 0; i < str.length(); i++)
        {
            if( i<str.length()-2 && str.charAt(i+1) == '0' && str.charAt(i+2) == '0')
            {
                x = Character.getNumericValue(str.charAt(i));
                x = x*10 + Character.getNumericValue(str.charAt(i+1));
                i=i+2;
            }
            else if( i<str.length()-2 && str.charAt(i+2) == '0')
            {
                x = Character.getNumericValue(str.charAt(i));
                x = x*10 + Character.getNumericValue(str.charAt(i+1));
                i=i+2;
            }
            else
            {
                x = Character.getNumericValue(str.charAt(i));
            }

            ch = (char) (x+96);
            System.out.print(ch);

        }
        System.out.println();

    }
}