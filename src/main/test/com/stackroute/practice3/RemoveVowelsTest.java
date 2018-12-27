package com.stackroute.practice3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels remvow;
    @Before
    public void setUp() throws Exception {
        remvow = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        remvow = null;

    }

    @Test
    public void testremoveVowels() throws  Exception{

        String expectedStr[] = {"vnsh","p","nd","rksh","mlly"};
        String actualStr[] = {"avinash", "pai","and", "raksha", "mallya"};
        assertEquals(expectedStr, remvow.withoutVowel(actualStr));
    }
}