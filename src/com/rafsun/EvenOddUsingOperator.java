package com.rafsun;

public class EvenOddUsingOperator {
    public static void main(String[] args) {
        int n = 51;
        if((n&1) == 1)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }
}
