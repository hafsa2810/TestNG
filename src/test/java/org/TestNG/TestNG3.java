package org.TestNG;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.Utilities.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG3 extends BaseClass {
	
	@BeforeClass
	private void browser() {
		LaunchChrome();
		winMax();
		
		}
	
	@Test
	private void tc1() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement lgn = driver.findElement(By.xpath("//span[text()='Sign In / Register']"));
		    lgn.click();
		    
			
			WebElement crtacc = driver.findElement(By.xpath("//span[text()='Create Account']"));
			crtacc.click();
		Thread.sleep(2000);

	}


	@Test
	private void tc2() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement btn = driver.findElement(By.xpath("//span[text()='Are you a Member of the Museum?']"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)",btn);
			Thread.sleep(2000);
}
}
