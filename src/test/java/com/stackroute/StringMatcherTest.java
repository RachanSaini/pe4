package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StringMatcherTest {

    private StringMatcher Obj = new StringMatcher();

    @Test
    public void stringMatcherTest() {


        String actualString = "She sells seashells by the seashore.";
        String actualCharacter = "se";
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add(0, "Found at: 4-6");
        expectedResult.add(1, "Found at: 10-12");
        expectedResult.add(2, "Found at: 27-29");

        ArrayList<String> actualResult = stringMatcher(actualString, actualCharacter);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void stringMatcherTest() {


        String actualString = "I am not as sure as you are of i am .";
        String actualCharacter = "am";
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add(0, "Found at: 2-4");
        expectedResult.add(1, "Found at: 33-35");

        ArrayList<String> actualResult = stringMatcher(actualString, actualCharacter);
        assertEquals(expectedResult, actualResult);


    }

    @Test
    public void stringMatcherTest() {


        String actualString = "She sells seashells by the seashore.";
        String actualCharacter = "se";
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add(0, "Found at: 4-6");
        expectedResult.add(1, "Found at: 10-12");

        ArrayList<String> actualResult = stringMatcher(actualString, actualCharacter);
        assertNotEquals(expectedResult, actualResult);


    }

}