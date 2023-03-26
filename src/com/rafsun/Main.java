package com.rafsun;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//        Scanner read = new Scanner(System.in);
//        int num = read.nextInt();
//        armStrong(num);

        int n = 4;
        int x = (int) Math.pow(2.0, n);
        System.out.println(x);

    }
    public static boolean armStrong(int num)
    {
        int n = num;
        int sum=0;

        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            sum+= (rem*rem*rem);
        }
        if(sum == num)
        {
            return true;
        }
        else
            return false;
    }
}
