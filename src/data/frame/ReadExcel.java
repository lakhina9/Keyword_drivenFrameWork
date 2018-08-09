package data.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
public class ReadExcel {
	
	public static void main(String[] args) throws IOException{
		
		//parameterized constor
		File file=new File("C:\\Selenium_Class\\data1.xls");
		//putting lock and taking part n which need to operate
		FileInputStream stream=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet("Sheet1");
	
	//	Row row=sheet.getRow(1);
	/*	Cell cell=row.getCell(2);
		System.out.println(cell.getStringCellValue()); */
		
		//Generic form :--- 1st
		
	/*	int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			
		for(int i=0;i<rowCount+1;i++){
			Row row=sheet.getRow(i);
		
		for(int j=0;j<row.getLastCellNum();j++){
		System.out.print(row.getCell(j).getStringCellValue() + "||");
		}
	      System.out.println();
		}*/
		
		//Generic form :---  2nd
	for(int i=0;i<=sheet.getLastRowNum();i++){
		
		Row row=sheet.getRow(i);
	for(int j=0;j<row.getLastCellNum();j++){
		System.out.print(row.getCell(j).getStringCellValue() + " ");
		String value=row.getCell(j).getStringCellValue();
		
	}
	System.out.println();
	
	}
	
			
	}
	
	

}
