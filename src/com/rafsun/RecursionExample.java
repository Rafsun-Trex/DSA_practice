package com.rafsun;

public class RecursionExample {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n)
    {
        System.out.println(n);


        if(n==10)
        {
            return;
        }
        
        print(n+1);

    }
}
