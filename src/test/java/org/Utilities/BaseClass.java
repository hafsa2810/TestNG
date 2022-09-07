package org.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
	
	public static void LaunchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	public static void winMax() {
	driver.manage().window().maximize();
	}
	
	public static void loadUrl(String url) {
		driver.get(url);

	}
	
	public static void printTitle() {
		System.out.println(driver.getTitle());

	}
	public static void printCurrentUrl(){
System.out.println(driver.getCurrentUrl());

}
	public static void rightClick(WebElement ele) {
		Actions a = new Actions (driver);
		a.contextClick(ele).perform();
		
	}
	public static void dClick(WebElement ele) {
		Actions a = new Actions (driver);
		a.doubleClick(ele).perform();
		
	}
	public static void move(WebElement ele) {
		Actions a = new Actions (driver);
		a.moveToElement(ele).perform();
		
	}
	
	public static void closeBrowser() {
		driver.close();

	}
	public static  void fill(WebElement ele, String value) {
	ele.sendKeys(value);

	}
	public static void btnClick(WebElement ele) {
		ele.click();
		}
	public static String getdata(int rowNumber, int cellNumber) throws IOException {

		File f = new File("C:\\Users\\Hp\\eclipse-workspace\\TheMetStore\\src\\test\\resources\\ExcelFile\\testdata.xlsx");
			
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row row = s.getRow(rowNumber);
		
		Cell cell = row.getCell(cellNumber);
		
		int cellType = cell.getCellType();
		
		String value ="";
		if(cellType==1) {
		value = cell.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd MMM yyyy z");
			value = sim.format(d);
		}
		else {
			
			double d = cell.getNumericCellValue();
			
			long l = (long)d;
			
			value = String.valueOf(l);
		}
		
		
		return value;
		
		
	}	
}



