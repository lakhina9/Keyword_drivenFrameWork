package data.frame;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassExecutor {

	public static void main(String[] args) throws IOException,
			NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		ReadExclFile1 ob = new ReadExclFile1();		
/*		HashMap<Integer, ArrayList<String>> temp= ob.getSheetName();
	
		for(int j=0;j<temp.size();j++){
		  
		   ArrayList<String> sheets= temp.get(j);
	*/	   
		           
            	   
		   
	HashMap<Integer, ArrayList<String>> tempmap = ob.readexcl();

	     for (int i = 0; i < tempmap.size(); i++) {

			ArrayList<String> tempList = tempmap.get(i);
			LibraryKeyWord.callMethods(tempList.get(0), tempList.get(1),
					tempList.get(2), tempList.get(3));
			
			ob.writeExcel(LibraryKeyWord.result, "TC1", i);
		}

	}

	// LibraryKeyWord.clickButton("name","userName", "batman");
	// LibraryKeyWord.enterText("name", "password", "batman");
	// LibraryKeyWord.openBrowser("chrome","http://newtours.demoaut.com/",
	// "anything");

}
}