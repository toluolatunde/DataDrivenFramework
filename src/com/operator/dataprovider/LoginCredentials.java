package com.operator.dataprovider;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class LoginCredentials {
	
		@DataProvider(name = "Agentlogin")
		public static Object[][] Agentlogin() throws Exception {
			
			FileInputStream file = new FileInputStream("./TestData/LoginData.xlsx");
			XSSFWorkbook book = new XSSFWorkbook(file);
			XSSFSheet loginSheet = book.getSheet("AgentLogin");
			int numberOfData = loginSheet.getPhysicalNumberOfRows();
			Object [][] testData = new Object[numberOfData][2];
			
			for (int i =0; i<numberOfData;i++ ) {
				XSSFRow row = loginSheet.getRow(i);
				XSSFCell email = row.getCell(0);
				XSSFCell password = row.getCell(1);
				testData[i][0] = email.getStringCellValue();
				testData[i][1] = password.getStringCellValue();
						
			}
			return testData;
		}

		@DataProvider(name = "Iswlogin")
		public static Object[][] Iswlogin() throws Exception {
			
			FileInputStream file = new FileInputStream("./TestData/LoginData.xlsx");
			XSSFWorkbook book = new XSSFWorkbook(file);
			XSSFSheet loginSheet = book.getSheet("IswLogin");
			int numberOfData = loginSheet.getPhysicalNumberOfRows();
			Object [][] testData = new Object[numberOfData][2];
			
			for (int i =0; i<numberOfData;i++ ) {
				XSSFRow row = loginSheet.getRow(i);
				XSSFCell email = row.getCell(0);
				XSSFCell password = row.getCell(1);
				testData[i][0] = email.getStringCellValue();
				testData[i][1] = password.getStringCellValue();
						
			}
			return testData;
		}
		
		@DataProvider(name = "Banklogin")
		public static Object[][] Banklogin() throws Exception {
			
			FileInputStream file = new FileInputStream("./TestData/LoginData.xlsx");
			XSSFWorkbook book = new XSSFWorkbook(file);
			XSSFSheet loginSheet = book.getSheet("InstitutionLogin");
			int numberOfData = loginSheet.getPhysicalNumberOfRows();
			Object [][] testData = new Object[numberOfData][2];
			
			for (int i =0; i<numberOfData;i++ ) {
				XSSFRow row = loginSheet.getRow(i);
				XSSFCell email = row.getCell(0);
				XSSFCell password = row.getCell(1);
				testData[i][0] = email.getStringCellValue();
				testData[i][1] = password.getStringCellValue();
						
			}
			return testData;
		}
}
