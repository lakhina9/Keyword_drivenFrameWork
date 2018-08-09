package data.frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ReadExclFile1 {
	
	//public static void main(String[] args) throws IOException{
/*	
public HashMap<Integer, ArrayList<String>> getSheetName() throws IOException{
		File file=new File("C:\\Selenium_Class\\test1.xls");		
		FileInputStream fis=new FileInputStream(file);  //--reads in bytes
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("Index");
		Row row;
	 //  Cell cell;
		HashMap<Integer,ArrayList<String>> map1=new HashMap<Integer,ArrayList<String>>();
		
		for(int i=0;i<sheet.getLastRowNum()+1;i++){
			row=sheet.getRow(i);
			
			ArrayList<String> list1= new ArrayList<String>();
			for(int j=0;j<row.getLastCellNum();j++){
			//	System.out.println(row.getCell(j).getStringCellValue()); 
				list1.add(row.getCell(j).getStringCellValue());
			
							}
		
	//System.out.println(list1);
	map1.put(i, list1);
			}
				//System.out.println(map1);
				
				return map1; }
*/
	
		
	public HashMap<Integer,ArrayList<String>> readexcl() throws IOException{
		
						
		File file=new File("C:\\Selenium_Class\\test2.xls");		
		FileInputStream fis=new FileInputStream(file);  //--reads in bytes
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("TC1");
		
		Row row;
		Cell cell;
		HashMap<Integer,ArrayList<String>> map=new HashMap<Integer,ArrayList<String>>();
		
		for(int i=0;i<sheet.getLastRowNum()+1;i++){
		  row=sheet.getRow(i);
          ArrayList<String>list=new ArrayList<String>();
		  
          for(int j=0;j<row.getLastCellNum();j++){
		 //System.out.print(row.getCell(j).getStringCellValue() + " ");
			
        	  list.add(row.getCell(j).getStringCellValue());
        	            }
          map.put(i, list);
          //System.out.println(list);
          //list.clear();
                  
		}
		 System.out.print(map); 
		 System.out.println();
		return (map);
		}

	

	public void writeExcel(String result,String sheetName,int rowNum) throws IOException{
		
		File file=new File("C:\\Selenium_Class\\test1.xls");
		FileInputStream fis=new FileInputStream(file); 
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("TC1");
		Row row=sheet.getRow(rowNum);
		Cell cell=row.createCell(4);
		cell.setCellValue(result);
		
		
		
		FileOutputStream outstrem=new FileOutputStream(file);
		workbook.write(outstrem);
		
	}

}







