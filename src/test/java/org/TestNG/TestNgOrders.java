package org.TestNG;

import java.util.Date;

import org.testing.Login;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgOrders extends Login {
@BeforeClass
	
	private void browser() {
		System.out.println("Chrome");
 }
	
	@AfterClass
	private void browserClose() {
		System.out.println("close");

		}
	
	@Test(priority = 5)
	private void tc3() {
		System.out.println("test 3");

	}
	@Test(priority = -8, enabled = false)
	private void tc5() {
		System.out.println("test 5");

	}
	@Test(priority = 7, invocationCount = 4)
	private void tc1() {
		System.out.println("test 1");

	}
	@Test(priority = -6)
	private void tc2() {
		System.out.println("test 2");

	}
	@Test(priority = 5)
	private void tc4() {
		System.out.println("test 4");

	}
	@Test(priority = -4)
	private void tc6() {
		System.out.println("test 6");

	}
	@Test(priority = 3)
	private void tc7() {
		System.out.println("test 7");

	}
	@Test(priority = -2)
	private void tc8() {
		System.out.println("test 8");

	}
	@Test(priority = 1, enabled =  true)
	private void tc9() {
		System.out.println("test 9");

		}
	@BeforeMethod
	private void start() {
		System.out.println(new Date());
		loadUrl("https://store.metmuseum.org/");

	}
	@AfterMethod
	private void end() {
		System.out.println(new Date());

	}
}



