package com.calculator2;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class b_Implement_Provider {
 
	@DataProvider(name = "addMethodDataProvider")
    public static Object[][] addMethodDataProvider() {
        return new Object[][] { { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 } };
    }
 
    @DataProvider(name = "subtractMethodDataProvider")
    public static Object[][] subtractMethodDataProvider() {
        return new Object[][] { { 2, 5, -3 }, { 3, 7, -4 }, { 24, 5, 19 } };
    }
 
    @DataProvider(name = "multiplyMethodDataProvider")
    public static Object[][] multiplyMethodDataProvider() {
        return new Object[][] { { 2, 5, 10 }, { 3, 7, 21 }, { 4, 5, 20 } };
    }
 
    @Test(dataProvider = "addMethodDataProvider")
    public void testAddMethod(int a, int b, int result) {
    	a_Implement_TestNG calculator = new a_Implement_TestNG();
        Assert.assertEquals(calculator.Addition(a, b), result);
    }
    @Test(dataProvider = "subtractMethodDataProvider")
    public void testSubtractMethod(int a, int b, int expectedResult) {
    	a_Implement_TestNG calculator = new a_Implement_TestNG();
        Assert.assertEquals(calculator.Substraction(a, b), expectedResult);
    }
 
    @Test(dataProvider = "multiplyMethodDataProvider")
    public void testMultiplyMethod(int a, int b, int expectedResult) {
    	a_Implement_TestNG calculator = new a_Implement_TestNG();
        Assert.assertEquals(calculator.Multipication(a, b), expectedResult);
    }
 
}