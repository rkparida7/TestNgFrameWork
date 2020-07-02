package com.calculator2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class d_Implement_Group {
		public int a= 100; int b= 50;
		
		public int Addition(int a, int b) {
			return a + b;
		}
		public int Substraction(int a, int b) {
			return a - b;
		}
		public int Multipication(int a, int b) {
			return a * b;
		}
		public int Division(int a, int b) {
			return a / b;
		}
		
		@Test(groups = "ADD")
		public void calculation1() {
			System.out.println("Addition is: "+Addition(a, b));
			Assert.assertEquals(Addition(a, b), 150);
			System.out.println("Addition is done Successfully");
		}
		
		@Test(groups = "SUBS")
		public void calculation2() {
			System.out.println("Substraction is: "+Substraction(a, b));
			Assert.assertTrue(Substraction(a, b)==(a-b));
			System.out.println("Substraction is done Successfully");
		}
		
		@Test(groups = "MULT")
		public void calculation3() {
			System.out.println("Multipication is: "+Multipication(a, b));
			Assert.assertFalse(Multipication(a, b)!=(a*b));
			System.out.println("Multipication is done Successfully");
		}
		
		@Test(groups = "DIVI")
		public void calculation4() {
			Division(a, b);
			int actual1 =Division(a, b);
			System.out.println("Division Value :"+actual1);
			int actual2= 3;
			Assert.assertNotEquals(actual1, actual2);
			System.out.println("Division is done Successfully");
			System.out.println("------Assertion is Done Successfully--------");
		}

}
