package com.stackroute;

//Write a program to replace all d with f and all l with t in the given String
//
//        Input: daily dry
//
//        Output: faity fry
//
//        Original string: daily dry
//
//        New String: faity fry

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllDwithFAndLwithT {
    public String replaceAllDwithFAndLwithT(String s){
        final String REGEX1 = "D";
        final String REGEX2 = "L";

        Pattern p1 = Pattern.compile(REGEX1);
        Pattern p2 = Pattern.compile(REGEX2);

        String result;

        result = s.replaceAll(REGEX1, "F").replaceAll(REGEX2,"T").replaceAll("d","f").replaceAll("l","t");
        return result;


    }


    }


