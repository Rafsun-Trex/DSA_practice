package com.rafsun;

public class NewtonRaphsonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n)
    {
        double x = n;
        double root;

        while(true)
        {
            root = .5 * (n + (x/n));
            if(Math.abs(root - n) < 0.01)
            {
                break;
            }
            n = root;
        }
        return root;
    }
}
