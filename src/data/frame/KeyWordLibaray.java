package data.frame;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyWordLibaray {
	static WebDriver driver;
	
	public static void callMethods(String MethodName,String param1,String param2,String param3) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method method =KeyWordLibaray.class.getMethod(MethodName, String.class,String.class,String.class);
		method.invoke(MethodName, param1,param2,param3);
	}
		
	/*public static void Entertext(String param1,String param2,String param3){
		//System.out.println(param2); }
			
	/*	if(param1.equals("name"))
			driver.findElement(By.name(param2)).sendKeys(param3); */
		
		
	public static void ClickButton(String param1,String param2,String param3){
		
		System.out.println(param2);
	/*switch(param1){
	
	case "name" : driver.findElement(By.name("userName"));
	break;
	}*/
	
		}
	
/*public static void openBrowser(String param1,String param2,String param3){
		if(param1.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C://Selenium_Class//chromedriver_win32//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://courses.ultimateqa.com/users/sign_in");
		}*/
	}
	




