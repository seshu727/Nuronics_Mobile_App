package mobile;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//@Listeners(Generate.class)
public class nurosample {
	static AppiumDriver<MobileElement> driver;

@Test
	public static void Running1() throws Throwable {

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
		//Assert.assertTrue(false);

}
	
	@Test
	public static void LoginValid1() throws InterruptedException {
        Thread.sleep(1000);
		//	driver.findElement(By.id("com.tss.nuronics:id/close_img")).click();
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etEmail")));
			driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys("isha@mailinator.com");

			WebDriverWait wait1 = new WebDriverWait(driver, 50);
			wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etPassword")));
			driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys("The@12345");

			WebDriverWait wait2 = new WebDriverWait(driver, 50);
			wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/btnSignin")));
			driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();

			Thread.sleep(5000);
			WebDriverWait wait3 = new WebDriverWait(driver, 50);
			wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.TextView")));

			String textofclass = driver.findElement(By.className("android.widget.TextView")).getText();
			System.out.println(textofclass);
			Thread.sleep(1000);
			driver.findElement(By.className("android.widget.ImageButton")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Dashboard' and @index='0']")).click();
			Thread.sleep(3000);
	          //List<MobileElement>ff=	driver.findElements(By.id("com.tss.nuronics:id/count_txt1"));
	          //ff.get(2).click();
			   driver.findElement(By.id("com.tss.nuronics:id/count_txt1")).click();
		String t=	   driver.findElement(By.id("com.tss.nuronics:id/title_textview")).getText();
		System.out.println(t);
		//Assert.assertTrue(true);
		
		
			
			// String h = driver.getPageSource();

			// driver.findElements(By.xpath("//)).size() > 0)

			
	}
	
		
	}
