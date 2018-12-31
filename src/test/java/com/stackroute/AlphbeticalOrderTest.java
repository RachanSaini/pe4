package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AlphbeticalOrderTest {
    @Test
    public void Testcase1()
    {
        String str="My name is khan";
        ArrayList<String> list=new ArrayList<String>();
        list.add("is");
        list.add("khan");
        list.add("My");
        list.add("name");
        String str2=list.toString();
        assertEquals(str2,AlphbeticalOrder.sort(str));
    }
@Test
    public void Testcase2()
    {
      String str="you are your own";
      ArrayList<String> list=new ArrayList<String>();
      list.add("are");
      list.add("own");
      list.add("you");
      list.add("your");
      String str2=list.toString();
      assertEquals(str2,AlphbeticalOrder.sort(str));
    }
    @Test
    public void Testcase3(){
        String str="you";
        ArrayList<String> list=new ArrayList<>();
        list.add("you");
        String str2=list.toString();
        assertEquals(str2,AlphbeticalOrder.sort(str));
    }
}