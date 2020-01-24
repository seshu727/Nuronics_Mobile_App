package mobile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class screenshot2  extends nuronics{
	
	public  void screenshots() throws Throwable {
		
		SimpleDateFormat date = new SimpleDateFormat("dd_yy_mm hh_ss_mm");
		Date d = new Date();
		String d1= date.format(d)	;	
	         File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       	FileUtils.copyFile(file, new File("./screenshots5/screen+"+d1+".png"));
	 	
	   	
	 	
		
		
		
	}
	

}
