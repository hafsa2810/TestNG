package org.TestNG;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.Utilities.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG5 extends BaseClass {
	
	@BeforeClass
	private void browser() {
		LaunchChrome();
		winMax();
		
		}
	@AfterClass
	private void browserClose() {
		closeBrowser();
	}

	@Test()
	  private void tc1() throws IOException, InterruptedException{
		  LoginPojo l = new LoginPojo();
		  driver.get("https://store.metmuseum.org/"); 
		  driver.findElement(By.xpath("//span[text()='Sign In / Register']")).click();
			fill(l.getTxtUser(), getdata(1,0));
			fill(l.getTxtPass(), getdata(0,3));
			btnClick(l.getBtnLogin());
			Thread.sleep(2000);
	}
	
	@Test()
	  private void tc2() throws IOException, InterruptedException{
		  LoginPojo l = new LoginPojo();
		  driver.get("https://store.metmuseum.org/"); 
		  WebElement CP = driver.findElement(By.xpath("//a[text()='Met Custom Prints']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(CP).click().perform();
			
			WebElement ar = driver.findElement(By.xpath("//div[text()='Artists']"));
			a.moveToElement(ar).click().perform();
			
			Thread.sleep(2000);
	}

}

