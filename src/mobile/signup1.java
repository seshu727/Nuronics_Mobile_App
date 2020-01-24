package mobile;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

//@Listeners(listeners1.class)
public class signup1 {
	 String textt = "Class II";
	 String fp = "FORGOT PASSWORD";
	 
	 static String classn="Alphabets";
	static String uname = "Enter valid email id";
	static String pass = "password length should be min 8 characters";
	static String empty = "Email should not be empty";
	//static ExtentReports reports;
	// static ExtentTest test;

	static AppiumDriver<MobileElement> driver;

	
	/*
	 * public static void main(String[] args) throws Exception { sample1 s = new
	 * sample1(); s.starts(); s.signup(); s.login();
	 * 
	 * }
	 */
	
	@Test(priority = 0)
    public void starts() throws IOException {
	
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

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// System.out.println("done1");
		
}
	@Test(priority = 2)	
    public void signup() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.id("com.tss.nuronics:id/close_img")).click();
		  WebDriverWait a12 = new WebDriverWait(driver, 50);
		  a12.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		  "com.tss.nuronics:id/btnSignup")));
		  driver.findElement(By.id("com.tss.nuronics:id/btnSignup")).click();
		  System.out.println(":::::::::::::::::signup with valid data");
		  Thread.sleep(3000);
		  String text=  driver.findElement(By.id("com.tss.nuronics:id/title_textview")).getText();
		  System.out.println(text);
		  System.out.println("we are in signup page");
		  
		//  Thread.sleep(10000);
		  
		//  driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
		  
	
		  
		/*
		 * Thread.sleep(10000); String email= driver.findElement(By.
		 * xpath("//android.widget.TextView[@text='Email should not be empty' and @index='6']"
		 * )).getText(); System.out.println(email);
		 * 
		 * Thread.sleep(10000); String phone = driver.findElement(By.
		 * xpath("//android.widget.TextView[@text='Phone number should not be empty' and @index='8']"
		 * )).getText(); System.out.println(phone);
		 * 
		 * 
		 * Thread.sleep(10000); String pass= driver.findElement(By.
		 * xpath("//android.widget.TextView[@text='Password should not be empty' and @index='10']"
		 * )).getText(); System.out.println(pass);
		 * 
		 * 
		 * Thread.sleep(10000); String cpass= driver.findElement(By.
		 * xpath("//android.widget.TextView[@text='Confirm password should not be empty' and @index='12']"
		 * )).getText(); System.out.println(cpass); Thread.sleep(10000); //
		 * Thread.sleep(1000);
		 * 
		 * 
		 * 
		 * 
		 * driver.findElement(By.id("com.tss.nuronics:id/close_img")).click();
		 * 
		 */
		  
		/*
		 * WebDriverWait a1 = new WebDriverWait(driver, 50);
		 * a1.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "com.tss.nuronics:id/btnSignup")));
		 * System.out.println("signup with valid data");
		 */
		  
		
		//driver.findElement(By.id("com.tss.nuronics:id/btnSignup")).click();
		  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_name")).sendKeys("seshu");
		  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_email")).sendKeys("i@gmail.com");
		  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_phone")).sendKeys("8036003520");
		  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_password")).sendKeys("The@1234");
		  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_confirm_password")).sendKeys("The@1234");
		 
		  driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
		  Thread.sleep(5000);
		//  driver.findElement(By.className("android.widget.LinearLayout")).click();
		 // Thread.sleep(5000);
		  
		
		  if(driver.findElements(By.id("com.tss.nuronics:id/forgot_pwd")).size() > 0) {
		  
		
			  System.out.println("signup success");
}
		  else {
			  System.out.println("signup failed");
			
			  
		  }
		  
	
			
}
	  @Test(priority = 3)
      public void login() throws Exception {
		  WebDriverWait wait = new WebDriverWait(driver, 50);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etEmail")));
		  driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys("i@gmail.com");
		  
		  WebDriverWait wait1 = new WebDriverWait(driver, 50);
		  wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etPassword")));
		  driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys("The@1234");
		  
		  WebDriverWait wait2 = new WebDriverWait(driver, 50);
		  wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/btnSignin")));
		  driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
		  
		  Thread.sleep(5000);
		  WebDriverWait wait3 = new WebDriverWait(driver, 50);
		  wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.TextView")));
		  
		  String settingtext= driver.findElement(By.xpath("//android.widget.TextView[@text='Class II' and @index='0']")).getText();
			System.out.println(textt);
			System.out.println("user in settings page");
		
		//driver.findElements(By.xpath("//)).size() > 0)
		  
		  if(settingtext.equalsIgnoreCase(textt))
		  {
			  System.out.println(settingtext);
		  
		      System.out.println("login success");
		  
		  
		  }
		  else {
			  System.out.println("::::::::::::::::::::when user enter invalid login details");
			  System.out.println(" login failed");
		  }	
		  
		  Thread.sleep(3000);
		  driver.findElement(By.id("com.tss.nuronics:id/female_layout")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("com.tss.nuronics:id/textview")).click();
		  Thread.sleep(5000);
		  

			MobileElement el =(MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable("
				       + "new UiSelector().scrollable(true)).scrollIntoView("                      
				       + "new UiSelector().textContains(\"UPDATE\"));"));
				
		   Thread.sleep(10000);
				 
		  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btnupdate') and @text='UPDATE']")).click();
		  Thread.sleep(5000);
		  
	       String classname = driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'titleTxt') and @text='Alphabets']")).getText();
	
		  
		  if(classname.equalsIgnoreCase(classn)) {
			  System.out.println(classname);
			  System.out.println("update  success ");
		  }
		  else {
			  
			  System.out.println("update failed");
		  }
		  
		  Thread.sleep(1000);
		String ltitle =  driver.findElement(By.id("com.tss.nuronics:id/titleTxt")).getText(); 
		System.out.println(ltitle);
		
		String lname=  driver.findElement(By.id("com.tss.nuronics:id/authorsTxt")).getText();
	//	System.out.println(lname);
		
		 
		  
		  
		  
}      @Test(priority = 1)
	  public static void signwithinvalid() throws InterruptedException {
	
	  WebDriverWait a12 = new WebDriverWait(driver, 50);
	  a12.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  "com.tss.nuronics:id/btnSignup")));
	  driver.findElement(By.id("com.tss.nuronics:id/btnSignup")).click();
	  System.out.println("signup with Invalid data");
	  Thread.sleep(3000);
	  String text=  driver.findElement(By.id("com.tss.nuronics:id/title_textview")).getText();
	  System.out.println(text);
	  System.out.println("we are in signup page");
	  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_name")).sendKeys("seshu");
	  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_email")).sendKeys("pssss");
	  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_phone")).sendKeys("9091");
	  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_password")).sendKeys("Th");
	  driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_confirm_password")).sendKeys("The");
	 
	  driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
	  Thread.sleep(1000);
	 // driver.findElement(By.className("android.widget.LinearLayout")).click();
	  
	  
	  Thread.sleep(5000);	
	List<MobileElement> mail = driver.findElements(By.className("android.widget.TextView"));
		//System.out.println("List = "+ mail.size());
		String msg = mail.get(1).getText();
		  System.out.println("Error msg is = " + msg);
		  String msg1 = mail.get(2).getText();
		  System.out.println("Error msg is = " + msg1);
		  String msg2 = mail.get(3).getText();
		  System.out.println("Error msg is = " + msg2);
		  String msg3 = mail.get(4).getText();
		  System.out.println("Error msg is = " + msg3);
		  Thread.sleep(4000);
		  
		  
		  
		  if(msg.equalsIgnoreCase("Enter valid email id")) {
			  
		 
		  System.out.println("signup failed");
		  } 
		  else
		  {
		  System.out.println("signup success");
		  
		  }
		  
		  

	 
		 
	  }
		
	}



