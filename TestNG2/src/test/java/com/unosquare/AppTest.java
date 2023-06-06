package com.unosquare;

import org.testng.annotations.Test;

public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1()
    {
        System.out.println("Test 1");
    }

    @Test(groups = {"Sprint 10"})
    public void test2()
    {
        System.out.println("Test 2");
    }

    @Test(groups = {"Sprint 10", "Sprint 11"})
    public void test3()
    {
        System.out.println("Test 3");
    }
}
