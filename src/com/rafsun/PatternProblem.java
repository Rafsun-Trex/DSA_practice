package com.rafsun;

public class PatternProblem {
    public static void main(String[] args) {

        pattern31(4);

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

    static void pattern28(int n)
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
            int spaces = n - tot_nums;
            for (int i = 1; i <= spaces ; i++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= tot_nums; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n)
    {
        /*

          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4

         */


        for (int row = 1; row <= n ; row++) {
            int spaces = n-row;
            for (int i = 1; i <= spaces ; i++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col+ " ");
            }

            System.out.println();

        }
    }

    private static void pattern31(int n)
    {
        /*

         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4

         */

        int originalN = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }

    }

}
