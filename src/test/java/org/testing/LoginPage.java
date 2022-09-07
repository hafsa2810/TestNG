package org.testing;

import java.io.IOException;

import org.Utilities.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends LoginPojo {

	public static void main(String[] args) throws IOException {
		LaunchChrome();
		winMax();
		loadUrl("https://store.metmuseum.org/");
		printTitle();
		printCurrentUrl();
		
		WebElement lgn = driver.findElement(By.xpath("//span[text()='Sign In / Register']"));
	    lgn.click();
	    
		 LoginPojo l= new LoginPojo();
		fill(l.getTxtUser() ,getdata(3,4));
		
		WebElement txtPass = l.getTxtPass();
		 fill(txtPass, getdata(1,2));
		
		 WebElement btnLogin = l.getBtnLogin();
				 btnClick(btnLogin);
	}	
	}
	
