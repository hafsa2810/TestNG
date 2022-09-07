package org.testing;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass{
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://store.metmuseum.org/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement lgn = driver.findElement(By.xpath("//span[text()='Sign In / Register']"));
	    lgn.click();
	    
		WebElement txtUser = driver.findElement(By.xpath("//input[@placeholder='Your Email']"));
		txtUser.sendKeys("hafsa123@gmail.com");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txtPass.sendKeys("hafsa");
		
		WebElement lgnbtn = driver.findElement(By.xpath("//button[@name='send']"));
		lgnbtn.click();
	
		
	}

}



