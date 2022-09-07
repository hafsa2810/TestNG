package org.TestNG;

import org.testng.annotations.Test;

public class Employee {
	@Test(groups = "smoke")
	public void tc2() {
		System.out.println("test 2");

	}
@Test(groups = "regression")
public void tc1() {
	
	System.out.println("test 1");

}
@Test(groups = "sanity")
public void tc3() {
	System.out.println("test 3");

}
@Test(groups = "smoke")
public void tc4() {
	System.out.println("test 4");

}
}

