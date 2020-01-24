package mobile;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.MobileElement;

public class swipeleft {
	static String text3 = "Class III";
	
	
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws Throwable {
		
		
		swipeleft f = new swipeleft();
		f.Run();
	}
		public static void Run() throws Throwable {

		DesiredCapabilities cap = new DesiredCapabilities();

		// Set up desired capabilities and pass the Android app-activity and app-package
		// to Appium
		cap.setCapability("deviceName", "Redmi Note 7pro");
		cap.setCapability("udid", "35a5203a0204");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVerison", "7.0");
		cap.setCapability("autoGrantPermissions", "true");

		cap.setCapability("appPackage", "com.tss.nuronics"); 
		// This package name of your app (you can get it from apk info app)

		cap.setCapability("appActivity", "com.tss.nuronics.activities.SplashActivity");
		// Launcher activity of your app (you can get it from apk info app)

		// Create RemoteWebDriver instance and connect to the Appium server
		// It will launch the Calculator App in Android Device using the configurations
		// specified in Desired Capabilities

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);
	
	
	
		Thread.sleep(5000);
		driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys("isha@mailinator.com");
	/*
	 * WebDriverWait wait1 = new WebDriverWait(driver, 50);
	 * wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(
	 * "com.tss.nuronics:id/etPassword")));
	 */
		Thread.sleep(5000);
		driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys("The@12345");
	/*
	 * WebDriverWait wait2 = new WebDriverWait(driver, 50);
	 * wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(
	 * "com.tss.nuronics:id/btnSignin")));
	 */
	///Thread.sleep(5000);
		driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
		Thread.sleep(10000);
	///Thread.sleep(5000);
	/*
	 * WebDriverWait wait3 = new WebDriverWait(driver, 50);
	 * wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(
	 * "android.widget.TextView")));
	 */


		//String textofclass = driver.findElement(By.className("android.widget.TextView")).getText();

		// String h = driver.getPageSource();

		// driver.findElements(By.xpath("//)).size() > 0)
/*
		if(textofclass.equalsIgnoreCase(text3)) {
			System.out.println(":::::::::::::::::::When user enter valid login details");
			System.out.println(textofclass);
			System.out.println("login success");
		     System.out.println("Test pass");

		} else {

			System.out.println(" login failed");
			System.out.println("Test fail");
		}*/

		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='0/2' and @index='6']")).click();
		List<MobileElement> d = driver.findElements(By.className("android.widget.TextView"));
		System.out.println(d.size());
		//d.get(24).click();
		
		 String h =d.get(5).getText(); 
		 System.out.println(h);
		 d.get(5).click();
		 
		
		
		

		       List<MobileElement> elementList = driver.findElements(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceIdMatches(\".*id/list\")).setMaxSearchSwipes(5).scrollIntoView("
                        + "new UiSelector().text(\""));
		
		
	
	     }
	
	

}
