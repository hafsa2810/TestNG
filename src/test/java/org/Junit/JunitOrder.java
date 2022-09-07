package org.Junit;

import java.io.IOException;
import java.util.Date;

import org.Utilities.BaseClass;
import org.Utilities.LoginPojo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;





public class JunitOrder extends BaseClass{
	  @BeforeClass
	  public static void browserLaunch() {
		LaunchChrome();
		winMax();

	}
	  
	  @Before
	  public void startTime() {
		  Date d = new Date();
			System.out.println(d);

	}
	  
	  @After
	  public void endTime() {
		  Date d = new Date();
		System.out.println(d);

	}
	  
	  @Test
	  public void tc1() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), getdata(0,0));
		fill(l.getTxtPass(), getdata(0,1));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);

	}
	  @Test
	  public void tc3() throws IOException, InterruptedException{
		  LoginPojo l = new LoginPojo();
			fill(l.getTxtUser(), getdata(1,0));
			fill(l.getTxtPass(), getdata(0,3));
			btnClick(l.getBtnLogin());
			Thread.sleep(2000);
	}
	  @Test
	  public void tc2() throws IOException, InterruptedException {
		  LoginPojo l = new LoginPojo();
			fill(l.getTxtUser(), getdata(0,3));
			fill(l.getTxtPass(), getdata(0,4));
			btnClick(l.getBtnLogin());
			Thread.sleep(2000);
		
			String current = driver.getCurrentUrl();
			Assert.assertTrue("verify the current Url of incorrect page",current.contains("data"));
			System.out.println("Test 2 is passed");
	  }
	}
		
