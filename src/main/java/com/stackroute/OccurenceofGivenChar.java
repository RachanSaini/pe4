package com.stackroute;

public class OccurenceofGivenChar
{
    private String str;

    public OccurenceofGivenChar(String pass){
        str = pass;
    }

    public String CheckClassofInputLine()
    {
        String s = str.getClass().getName();
        return s;
    }

    public boolean CheckCharacter(String ch)
    {
        boolean val = str.contains(ch);
        return val;
    }

    public int NumberofOccurences(char ch)
    {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

}
