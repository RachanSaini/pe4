package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Harry {
    public String isHarry(String queryString) {        Pattern pattern = Pattern.compile("(?:^|\\W)Harry(?:$|\\W)");
        Matcher matcher = pattern.matcher(queryString);        boolean found = false;
        while (matcher.find()){
            found = true;
        }
        if(found == true)
            return "Is Harry here ? True";
        return "Is Harry here ? False";
    }
}
