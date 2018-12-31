package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllDwithFAndLwithTTest {
    ReplaceAllDwithFAndLwithT replaceAllDwithFAndLwithT;
    @Before
    public void setUp() throws Exception {
        replaceAllDwithFAndLwithT=new ReplaceAllDwithFAndLwithT();
    }

    @After
    public void tearDown() throws Exception {
        replaceAllDwithFAndLwithT=null;
    }

    @Test
    public void TestForOccurenceOfDAndL() {
        //arrange
        String expected="Tittte by tittte, fay by fay, what is mean for you WITT finf its way”";
        //act
        String actual=replaceAllDwithFAndLwithT.replaceAllDwithFAndLwithT("Little by little, day by day, what is mean for you WILL find its way”");
        //assert
        assertEquals(expected,actual);
    }
    @Test
    public void TestForOccurenceOfDs() {
        //arrange
        String expected="Fehrafun is a very happening city";
        //act
        String actual=replaceAllDwithFAndLwithT.replaceAllDwithFAndLwithT("Dehradun is a very happening city");
        //assert
        assertEquals(expected,actual);
    }
    @Test
    public void TestForOccurenceofLs() {
        //arrange
        String expected="I am teaving to Itaty";
        //act
        String actual=replaceAllDwithFAndLwithT.replaceAllDwithFAndLwithT("I am leaving to Italy");
        //assert
        assertEquals(expected,actual);
    }
    @Test
    public void TestForNoOccurences() {
        //arrange
        String expected="Have a great stay";
        //act
        String actual=replaceAllDwithFAndLwithT.replaceAllDwithFAndLwithT("Have a great stay");
        //assert
        assertEquals(expected,actual);
    }

}