package com.rafsun;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(prod(5123));
    }
    static int prod(int n)
    {
        if(n%10 == n)
        {
            return n;
        }

        return (n%10)*prod(n/10);
    }
}
