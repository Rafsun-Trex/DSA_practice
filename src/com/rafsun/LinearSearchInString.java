package com.rafsun;

public class LinearSearchInString {
    public static void main(String[] args) {
        String str = "Rafsun";
        char target = 'u';

        boolean b = searchString(str, target);
        boolean c = searchString2(str, target);

        if(b)
        {
            if(c)
            {
                System.out.println(target+" found in "+str);
            }

        }
        else
        {
            System.out.println(target+" not found in "+str);
        }
        //System.out.println(b);

    }


    static boolean searchString2(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }
        for (char ch:str.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }

    static boolean searchString(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target)
            {
                return true;
            }
        }
        return false;
    }
}
