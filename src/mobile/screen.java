package mobile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class screen  {

	static AppiumDriver<MobileElement> driver;
	
public static void screenshots(AppiumDriver<MobileElement> driver) throws IOException {
		
		SimpleDateFormat date = new SimpleDateFormat("dd_yy_mm hh_ss_mm");
		Date d = new Date();
		String d1= date.format(d);	
	    File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	FileUtils.copyFile(file, new File("./screenshots/screen+"+d1+".png"));
	 	
}


public static void login() {
	

	  WebDriverWait wait = new WebDriverWait(driver, 50);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  "com.tss.nuronics:id/etEmail")));
	  
	  driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys(
	  "ish.com");
	  
	  WebDriverWait wait1 = new WebDriverWait(driver, 50);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  "com.tss.nuronics:id/etPassword")));
	  driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys(
	  "The@1234");
	  
	  WebDriverWait wait2 = new WebDriverWait(driver, 50);
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  "com.tss.nuronics:id/btnSignin")));
	  driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
	  
	 String unamewrong = driver.findElement(By.id("com.tss.nuronics:id/username_error")).getText();
	 String passwrong = driver.findElement(By.id("com.tss.nuronics:id/password_error")).getText();
	 
	 

	  if (driver.findElements(By.className("android.widget.TextView")).size() > 0) {
		  
            System.out.println("login success");
            
        } else if(unamewrong.contains("Enter valid")) {
            System.out.println(unamewrong);
            System.out.println(passwrong);
            System.out.println("login failed");
            //System.out.println("enter valid username");
        }
        else if(unamewrong.contains("Email should")) {
        	System.out.println(unamewrong);
        	System.out.println(passwrong);
        	
        	 System.out.println("login failed");
        	//System.out.println("enter password");
        	
        	
        	
        }
	  
	
	  
	  
	
	
	
	
	
	
}

}
