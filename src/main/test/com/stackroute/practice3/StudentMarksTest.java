package com.stackroute.practice3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks sm;
    @Before
    public void setUp() throws Exception {
        sm = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        sm = null;
    }

    @Test
    public void testStudentMarks() throws Exception{
        int arr[] = {1,56,87,99,110};

        assertEquals("return proper value","error",sm.verifyGrade(arr));

        int arr1[] = {1,2,3,4,5};
        assertEquals("return proper value","correct",sm.verifyGrade(arr1));

    }
}