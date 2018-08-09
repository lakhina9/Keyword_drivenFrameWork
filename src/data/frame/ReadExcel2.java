package data.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ReadExcel2 {

public static void main(String[] args) throws IOException{
	
	//public HashMap<Integer,ArrayList<String>> readexcl() throws IOException {
		
		//parameterized constor
		File file=new File("C:\\Selenium_Class\\test.xls");		
		FileInputStream stream=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet("Sheet1");
		
		int row1= sheet.getLastRowNum();
		System.out.println(row1);
		//HashMap<Integer,ArrayList<String>> map=new HashMap<Integer,ArrayList<String>>();
	
		for(int i=0;i<=sheet.getLastRowNum();i++){
			ArrayList<String> list=new ArrayList<String>();
			
			Row row=sheet.getRow(i);
		   for(int j=0;j<row.getLastCellNum();j++){
			//System.out.print(row.getCell(j).getStringCellValue() + " ");
	        //String value=row.getCell(j).getStringCellValue();
		Cell cell=row.getCell(j);
		list.add(cell.getStringCellValue());		
			
		}
		//map.put(i,list);
		System.out.println(list);
		//list.clear();
		
		}
	
		//System.out.println(map);
//return(map);
}

}		

