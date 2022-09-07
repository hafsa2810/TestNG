package org.testing;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login1 extends BaseClass {

	public static void main(String[] args) {
		LaunchChrome();
		winMax();
		loadUrl("https://store.metmuseum.org/");
		printTitle();
		printCurrentUrl();
		
		WebElement lgn = driver.findElement(By.xpath("//span[text()='Sign In / Register']"));
	    lgn.click();
	    
		WebElement txtUser = driver.findElement(By.xpath("//input[@placeholder='Your Email']"));
		fill(txtUser,getData(3,4));
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		fill(txtPass,getData(1,2));
		
		
		btnClick(txtPass);
		
		
		
		
	}

	private static String getData(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}

