package com.rafsun;

import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2==0)
            {
                for(int i=1;i<=n;i=i+2){
                    System.out.print(i+1+" "+i+" ");
                }
                System.out.println();
            }
            else
            {
                System.out.println(-1);
            }

        }
    }
}
