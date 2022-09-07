package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException  {
		
		File f = new File("C:\\Users\\Hp\\eclipse-workspace\\TheMetStore\\src\\test\\resources\\ExcelFile\\testdata.xlsx");
			
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(1);
		
		Cell c = r.getCell(2);
		
		System.out.println(c);
		
	}

}
