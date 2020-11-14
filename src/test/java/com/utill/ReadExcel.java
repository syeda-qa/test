package com.utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException   {
		
		
		FileInputStream fis = new FileInputStream("C:\\DRIVERS\\EXCEL\\sele.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row = sh.getRow(0);
		//XSSFCell cell= row.getCell(2);
		//XSSFRichTextString sc = cell.getRichStringCellValue();
		//String dd= sc.getString();
		
		int colCount = row.getLastCellNum();
		System.out.println("Total number of Cloumns in Excel sheet is:" + colCount);
		
		int rowCount = sh.getLastRowNum();
		System.out.println("Total number of Row in Excel sheet is:" + rowCount);
		
		for(int i=0; i<rowCount;i++) {
			String data0=sh.getRow(0).getCell(1).toString();
			String data1=sh.getRow(0).getCell(2).toString();
			String data2=sh.getRow(2).getCell(1).toString();
			String data3=sh.getRow(3).getCell(2).toString();
			String data4=sh.getRow(3).getCell(1).toString();
			String data5=sh.getRow(4).getCell(1).toString();
			System.out.println( data0 + " " + data1 + " " + data2+" "  + data3+" " + data4+ " " +data5  );
			
		}
		
	}

}
