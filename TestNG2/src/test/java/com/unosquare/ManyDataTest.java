package com.unosquare;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManyDataTest {

    @DataProvider(name = "loginData")
    public Object[][] dataToLogin(){
        return new Object[][]{
                {"ysalcedo", "12345", "22/05/1972"},
                {"bromero", "54321", "22/05/1972"},
                {"jdavila", "52142134", "22/05/1972"}
        };
    }

    @Test(dataProvider = "loginData")
    public void multipleLoginTest(String user, String password, String born){
        System.out.println("I logged in with "+user+", "+password+" born in "+born);
    }
}
