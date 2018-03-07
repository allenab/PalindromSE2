package com.example.allenab.ispalindromornot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private IsPalindrom palindrom;


    @Before
    public void setUp(){
        palindrom = new IsPalindrom();

    }
    @Test
    public void correctData() throws Exception {

        assertEquals(true, IsPalindrom.isPalindrome("Rentner"));
    }

    @Test
    public void incorrectData(){

        assertEquals(false, IsPalindrom.isPalindrome("Affe"));
    }


}