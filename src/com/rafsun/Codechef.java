package com.rafsun;

import java.util.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {

            int n = read.nextInt();
            int k = read.nextInt();
            String s = read.next();

            StringBuilder string = new StringBuilder(s);

            if(s.charAt(0) == '0')
            {
                string.setCharAt(0, '1');
                k--;
            }
            while(k-->0)
            {
                string.append('0');
            }

            System.out.println(string);


        }
    }
}