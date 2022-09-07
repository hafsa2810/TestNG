package org.TestNG;

import java.io.IOException;
import java.util.Date;

import org.Utilities.BaseClass;
import org.Utilities.LoginPojo;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TesgNG1 extends BaseClass{

	@BeforeClass
	private void browser() {
		LaunchChrome();
		winMax();
		
		}
	
	
	@AfterClass
	private void browserClose() {
		closeBrowser();

	}
	
	  
	@Test(priority = -2, invocationCount = 3)
	private void tc1() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		 driver.get("https://store.metmuseum.org/"); 
		 driver.findElement(By.xpath("//span[text()='Sign In / Register']")).click();
		fill(l.getTxtUser(), getdata(3,0));
		fill(l.getTxtPass(), getdata(0,1));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);

	}
	  @Test()
	  private void tc3() throws IOException, InterruptedException{
		  LoginPojo l = new LoginPojo();
		  driver.get("https://store.metmuseum.org/"); 
			 driver.findElement(By.xpath("//span[text()='Sign In / Register']")).click();
			fill(l.getTxtUser(), getdata(1,0));
			fill(l.getTxtPass(), getdata(0,3));
			btnClick(l.getBtnLogin());
			Thread.sleep(2000);
	}
	  @Parameters({"Welcome","Atos"})
	  @Test()
	  private void tc2(@Optional("Hafsa")String s1, @Optional("Hafsa123@")String s2) throws IOException, InterruptedException {
		  LoginPojo l = new LoginPojo();
		  driver.get("https://store.metmuseum.org/"); 
			 driver.findElement(By.xpath("//span[text()='Sign In / Register']")).click();
			fill(l.getTxtUser(), s1);
			fill(l.getTxtPass(), s2);
			btnClick(l.getBtnLogin());
	  			Thread.sleep(2000);
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
