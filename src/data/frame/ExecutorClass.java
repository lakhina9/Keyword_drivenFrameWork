package data.frame;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

public class ExecutorClass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		// TODO Auto-generated method stub
		
		ReadExcel2 ob=new ReadExcel2();
		
		/*HashMap<Integer,ArrayList<String>> tempmap= ob.readexcl();
		for(int i=0;i<tempmap.size();i++){
			
			ArrayList<String> tempList=tempmap.get(i);
			KeyWordLibaray.callMethods(tempList.get(0), tempList.get(1), tempList.get(2), tempList.get(3));
			
		}*/
							
							
        //KeyWordLibaray.openBrowser("openBrowser", "chrome", "http://newtours.demoaut.com/","Shilpa");
		KeyWordLibaray.callMethods("Entertext", "name", "UserName", "batman");
		KeyWordLibaray.callMethods("Entertext", "name", "password", "batman");
		KeyWordLibaray.callMethods("ClickButton", "login", "name", "null");
		
		
	}

}
