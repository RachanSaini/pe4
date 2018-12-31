package com.stackroute;

public class StringTranspose
{
    public static String setStringVar(String str)
    {
        String words[]=str.split(" ");//Split the string on the basics of space and store it into an string array//
        String reverse_string=" ";
        String fstr=" ";
        for(int i=0;i<words.length;i++)
        {
            String wd=words[i];//Store the each words into a string//
            String reverse_word=" ";
            for(int k=wd.length()-1;k>=0;k--)
            {
                reverse_word=reverse_word+wd.charAt(k);
            }

            reverse_string=reverse_string+reverse_word.trim()+" ";
            fstr=reverse_string.trim();
        }
        return fstr;

    }
}
