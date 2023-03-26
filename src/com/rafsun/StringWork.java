package com.rafsun;

public class StringWork {
    public static void main(String[] args) {

        // O(n^2) complexity
        // new object is created everytime then adding
//        String series = "";
//        for (int i = 0; i < 26; i++) {
//            char a = (char) ('a' + i);
//            series = series + a;
//        }
//        System.out.println(series);



        // O(n) complexity
        // mutable, so modifying object and appending
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char a = (char) ('a' + i);
            series.append(a);
        }
        System.out.println(series);

    }
}
