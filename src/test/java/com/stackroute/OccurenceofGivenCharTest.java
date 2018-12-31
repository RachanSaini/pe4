package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceofGivenCharTest {

    OccurenceofGivenChar ref;

    @Before
    public void setUp() throws Exception
    {
        ref=new OccurenceofGivenChar("Java is java again java again");
    }

    @After
    public void tearDown() throws Exception
    {
        ref=null;
    }

    @Test
    //Test case to check the class of the given string by the user.
    //exp:- input string- Java is java again java again
    // So in the above statement you have to check the class of the above sentence.Here it is String,so its return "java.lang.String".
    public void TestCase1()
    {
        assertEquals("java.lang.String",ref.CheckClassofInputLine());
    }

    @Test
    //Test case to take a character from the given String
    //In this case you have to check that the given character is present or not in the above line,if it is present then its return true,
    //otherwise it's false.
    //Exp:- input string--Java is java again java again
    //you have to check the occurences of character 'a',if it's present,then returns true,otherwise false.
    public void TestCase2()
    {
        assertEquals("true",ref.CheckCharacter('a'));
    }

    @Test
    //Test case to check the number of occurences of a given character
    //In this case you have to count the number of occurences of the given character in the given string and returns the number.
    public void TestCase3()
    {
        assertSame(4,ref.NumberofOccurences());
    }


}
