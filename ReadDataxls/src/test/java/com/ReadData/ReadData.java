package com.ReadData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData {

	public void readdatafromexcel() throws Exception {

		String path = "E:\\SeleniumClass2024\\Excelutils\\TestData.xls";

		FileInputStream fs = new FileInputStream(path);

		// xls

		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFSheet sheet = wb.getSheet("Login");
		// System.out.println(sheet.getRow(1).getCell(1));
		int rowCount = sheet.getLastRowNum();
		System.out.println("How many rows are there:"+ rowCount);
		for(int i=0; i<=rowCount; i++) 
		{
			
			//get cell count in a row 
			
		int cellcount =	sheet.getRow(i).getLastCellNum();
		System.out.println("Row"+i+"data is:");
		for(int j=0; j<cellcount; j++) {
			
			
		System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"|");
		
		
		}
		System.out.println();
			
		}

	}

}
