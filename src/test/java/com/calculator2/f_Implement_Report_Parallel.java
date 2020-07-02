package com.calculator2;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class f_Implement_Report_Parallel 
{
 
    @Test
    public void testMethodsOne() {
    	try {
			a_Implement_TestNG cvalue = new a_Implement_TestNG();
			int result= cvalue.Addition(100, 200);
			System.out.println("Test1 "+result);
			
			long id = Thread.currentThread().getId();
			System.out.println("Simple test-method One. Thread id is: " + id);
			Reporter.log("TestNG_ReportsAndLogs -> -------Pass------", true);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("TestNG_ReportsAndLogs -> -------Fail------", true);
		}
    }
 
    @Test
    public void testMethodsTwo() {
    	
    	try {
			a_Implement_TestNG cvalue = new a_Implement_TestNG();
			int result= cvalue.Substraction(1200, 200);
			System.out.println("Test2 "+result);
			
			long id = Thread.currentThread().getId();
			System.out.println("Simple test-method Two. Thread id is: " + id);
			Reporter.log("TestNG_ReportsAndLogs -> -------Pass------", true);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("TestNG_ReportsAndLogs -> -------Fail------", true);
		}
    }
 
}
