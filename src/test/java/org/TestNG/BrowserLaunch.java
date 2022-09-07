package org.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static WebDriver driver;
	@Parameters
	@Test
	private void tc1(String name) {
		System.out.println("launch Chrome");
		
		if(name.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		else if(name.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver ();
			}
		
		else  {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
		
		
		driver.get ("https://store.metmuseum.org/");
		
		
		
	}	
		
}
