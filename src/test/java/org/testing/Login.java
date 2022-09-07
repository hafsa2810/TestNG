package org.testing;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login extends BaseClass{
	
	public static void main(String[] args) {
		LaunchChrome();
		winMax();
		loadUrl("https://store.metmuseum.org/");
		printTitle();
		printCurrentUrl();
		
		
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

