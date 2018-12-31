package com.stackroute;
import java.lang.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringMatcher {
    public ArrayList<String> stringMatcher(String actualString, String actualCharacter){
//        String[] splitArray=actualString.split(" ");
        ArrayList<String> result=new ArrayList<>();
        int i=0;
        String s="";

        Pattern pattern = Pattern.compile(actualCharacter);
        Matcher matcher = pattern.matcher(actualString);
        System.out.println(matcher.toString());
        while (matcher.find()){
                s="Found at: "+matcher.start()+"-"+matcher.end();
            System.out.println(s);
                result.add(i,s);
            System.out.println(result);
                i++;
        }
        return result;
    }}
