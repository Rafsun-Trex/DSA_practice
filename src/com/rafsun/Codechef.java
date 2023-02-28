package com.rafsun;

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {

            int n = in.nextInt();
            String str = in.next();
            int x=0;
            char c;

            for (int j = 0; j < str.length(); j++)
            {

                if(str.charAt(j+1) == '0' && str.charAt(j+2) == '0')
                {
                    x = (int) str.charAt(j)-96;
                    x = x*10 + (int) str.charAt(j+1)-96;
                }
                else if(str.charAt(j+2) == '0')
                {
                    x = (int) str.charAt(j)-96;
                    x = x*10 + (int) str.charAt(j+1)-96;
                }
                else
                {
                    x = (int) str.charAt(j)-96;
                }

                c = (char) (x+96);
                System.out.print(c);
            }
            System.out.println();

        }
    }
}
