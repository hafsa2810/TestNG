package org.TestNG;

import org.testng.annotations.Test;

public class Client {
	
		@Test(groups = "smoke")
		public void tc22() {
			System.out.println("test 22");

		}
	@Test(groups = "regression")
	public void tc11() {
		System.out.println("test 11");

	}
	
	@Test(groups = "sanity")
	public void tc33() {
		System.out.println("test 33");

	}
	@Test(groups = "smoke")
	public void tc44() {
		System.out.println("test 44");

	}

}
	


