package org.TestNG;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.Utilities.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG4 extends BaseClass {
	
	@BeforeClass
	private void browser() {
		LaunchChrome();
		winMax();
		
		}
	
	@Test
	private void tc1() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement homeDecor = driver.findElement(By.xpath("//span[text()='Home Decor']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(homeDecor).perform();
			
			
			WebElement prints = driver.findElement(By.xpath("//span[text()='Prints & Posters']"));
			a.moveToElement(prints).click().perform();
		Thread.sleep(2000);

	}
	@Test
	private void tc2() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement Jewelry = driver.findElement(By.xpath("//span[text()='Jewelry']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(Jewelry).perform();
			
			
			WebElement necklace = driver.findElement(By.xpath("//span[text()='Necklaces']"));
			a.moveToElement(necklace).click().perform();
		Thread.sleep(2000);

	}
	@Test
	private void tc3() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement clothing = driver.findElement(By.xpath("//span[text()='Clothing & Accessories']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(clothing).perform();
			
			
			WebElement bag = driver.findElement(By.xpath("//span[text()='Bags']"));
			a.moveToElement(bag).click().perform();
		Thread.sleep(2000);

	}
	
	@Test
	private void tc4() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement books = driver.findElement(By.xpath("//span[text()='Books']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(books).perform();
			
			
			WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
			a.moveToElement(fashion).click().perform();
		Thread.sleep(2000);

	}
	
	@Test
	private void tc5() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement Stationery = driver.findElement(By.xpath("//span[text()='Stationery']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(Stationery).perform();
			
			
			WebElement clnr = driver.findElement(By.xpath("//span[text()='Calendars']"));
			a.moveToElement(clnr).click().perform();
		Thread.sleep(2000);

	}
	
	@Test
	private void tc6() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement Collaborations = driver.findElement(By.xpath("//span[text()='Collaborations']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(Collaborations).perform();
			
			
			WebElement ag = driver.findElement(By.xpath("//span[text()='Ann Gish']"));
			a.moveToElement(ag).click().perform();
		Thread.sleep(2000);

	}
	
	
	@Test
	private void tc7() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 
		 WebElement gg = driver.findElement(By.xpath("//span[text()='Gift Guide']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(gg).perform();
			
			
			WebElement gift= driver.findElement(By.xpath("//span[text()='Gifts for Her']"));
			a.moveToElement(gift).click().perform();
		Thread.sleep(2000);

	}
	
	
}

