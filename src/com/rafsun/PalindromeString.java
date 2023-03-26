package com.rafsun;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abcdvcba";
        StringBuilder str = new StringBuilder(s);
        str = str.reverse();
        String s2 = str.toString();

        if(s.equals(s2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
