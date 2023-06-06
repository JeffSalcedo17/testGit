package com.unosquare;

import org.testng.annotations.Test;

public class OrderTest {

    @Test
    public void a(){
        System.out.println("This is a");
    }

    @Test
    public void d(){
        System.out.println("This is d");
    }

    @Test(dependsOnMethods = {"d"})
    public void c(){
        System.out.println("This is c");
    }

    @Test(dependsOnMethods = {"c", "d"})
    public void b(){
        System.out.println("This is b");
    }

}
