package com.stackroute.practice3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumTest {

    ConsecutiveNum cnum;
    @org.junit.Before
    public void setUp() throws Exception {
        cnum = new ConsecutiveNum();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        cnum = null;
    }

    @Test
    public void testgetConsecutuive() throws Exception{

        assertEquals("return true or false", true,cnum.checkForConsecutive("1,2,3,4,5"));
        assertEquals("return true or false", true,cnum.checkForConsecutive("5,4,3,2,1"));
        assertEquals("return true or false", false,cnum.checkForConsecutive("1,7,3,4,5"));
        assertEquals("return true or false", false,cnum.checkForConsecutive("54,67,68,69,70"));


    }

    @Test
    public void testgetConsecutiveFailure() throws Exception{
        assertNotNull("should return anything but not null", cnum.checkForConsecutive("1,2,3,5"));
    }
}