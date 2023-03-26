package com.rafsun;

public class PatternProblem {
    public static void main(String[] args) {

        pattern5(4);

    }

    static void pattern1(int n)
    {
        /*

         * * * *
         * * * *
         * * * *
         * * * *

         */

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        /*

        *
        * *
        * * *
        * * * *
                   */

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern3(int n)
    {
        /*

         * * * *
         * * *
         * *
         *

         */

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n-row+1); col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n)
    {
        /*

         1
         1 2
         1 2 3
         1 2 3 4

         */

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n)
    {
        /*

         *
         * *
         * * *
         * * * *
         * * *
         * *
         *

         */

        for (int row = 1; row <= 2*n; row++) {
            int tot_nums = row > n ? 2 * n - row : row;
            for (int col = 1; col <= tot_nums; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
