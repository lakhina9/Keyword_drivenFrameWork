package data.frame;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibraryKeyWord {
	
	static String result;
	
	static WebDriver driver;
	public static void callMethods(String methodName,String param1,String param2,String param3) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	Method method=LibraryKeyWord.class.getMethod(methodName, String.class,String.class,String.class);
	method.invoke(methodName, param1,param2,param3);
	}
	
		/*public static void enterText(String param1,String param2,String param3){
				System.out.println(param1 + param2 + param3);
				}

	public static void clickButton(String param1,String param2,String param3){
		System.out.println(param1 + param2 + param3);
		
	}*/
   public static void openbrowser(String param1,String param2,String param3){
	   	   	  
	  try{ 
	   if(param1.equals("chrome")){
	   System.setProperty("webdriver.chrome.driver", "C://Selenium_Class//chromedriver_win32//chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get(param2);
		
		//System.out.println(param1 + param2 + param3);
	   result="Pass";
	   }	 } 
	   catch(Exception e){
		   result="Fail";
		   System.out.println("browser opening failed");
	   }
	   }
	   
	    
 public static void enterName(String param1,String param2,String param3){
	 try{
		 if(param1.equals("name"))
			 
	 	 driver.findElement(By.name(param2)).sendKeys(param3);
	 result="Pass";
	 System.out.println("Name:Element found");
	 }
 
	 catch(Exception e){
	result="Failed";
	System.out.println("Name:Element no found");
}
 }
 
 public static void enterPassword(String param1,String param2,String param3){
	 try{
		 
		 if(param1.equals("password")){
			 driver.findElement(By.name(param2)).sendKeys(param3);
			 result="Pass";
			 System.out.println("Password:Element found");
			 
		 }}catch(Exception e){
			 result="Fail";
			 System.out.println("Password:Element no found");
		  
	 }
	 		 
 }
   public static void login(String param1,String param2,String param3){
	   try{
		   if(param1.equals("button")){
			   driver.findElement(By.name(param2)).click();
			  
				 System.out.println("Login button:Element found");
				 result="Pass";
	   }} catch(Exception e){
		   result="Fail";
			 System.out.println("Login button:Element not found");
		  	   	   	   }
  }
   
   public static void openbrowserFB(String param1,String param2,String param3){
	   	  
		  try{ 
		   if(param1.equals("chrome")){
		   System.setProperty("webdriver.chrome.driver", "C://Selenium_Class//chromedriver_win32//chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get(param2);
			
			//System.out.println(param1 + param2 + param3);
		   result="Pass";
		   }	 } 
		   catch(Exception e){
			   result="Fail";
			   System.out.println("browser opening failed");
		   }
		   }
   
   
 /*public static void typeRadio(String param1,String param2,String param3){
	 try{
		 
		 if(param1.equals("radio")){
	        List<WebElement> radio=driver.findElements(By.name(param2));
       for(int i=0;i<radio.size();i++){
 		   	System.out.println(radio.get(i).getAttribute(param3));
 		   result="Pass";
			 System.out.println("Radio Button :Element found");}
 		   	
       }
	    } catch(Exception e){
			   result="Fail";
		 System.out.println("Radio Button:Element not found");
	    
	 } }*/
  
			        
}







