package com.annarm.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClassTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void doTest(){
        new TestClass().test1();
    }
}