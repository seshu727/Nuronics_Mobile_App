package mobile;

	
	import static org.testng.Assert.assertEquals;

    import java.net.URL;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileBy;
	import io.appium.java_client.MobileElement;

    //@Listeners(listeners1.class)

public class full {
		static String text3 = "Class I";
		static String text4 = "Enter valid email id";
	    static String text22 = "Password length should be min 8 characters";
		static String text6 = "Email should not be empty";
		static String text5 ="FORGOT PASSWORD";

		static AppiumDriver<MobileElement> driver;

		// @SuppressWarnings("static-access")
	/*
	 * public static void main(String[] args) throws Throwable { nuronics n = new
	 * nuronics(); screenshot1 d = new screenshot1();
	 * 
	 * // Toastmessages e = new Toastmessages();
	 * 
	 * n.Running(); // d.screenshots(); // n.LoginValid(); // d.screenshots();
	 * 
	 * // n.LoginInvalid(); // e.readToastMessage();
	 * 
	 * // n.LoginValid(); n.Invalidemailid(); n.InavlidPassWord(); n.LoginNull();
	 * n.ForgotpasswordValid(); n.ForgotpasswordInValid(); n.ForgotpasswordNull();
	 * n.LoginValid(); n.profile(); n.Changepassword(); n.actionsbtn(); n.logout();
	 * n.LoginAfterupdating(); n.actionsbtn();
	 * 
	 * n.settings(); n.actionsbtn(); n.logout();
	 * 
	 * // n.swipee(); // n.settings();
	 * 
	 * // n.profile(); // n.Changepassword(); // n.LoginValid1(); // n.logout(); //
	 * n.LoginValid1();}
	 */
		

		@Test(priority = 0)
		public static void Running() throws Throwable {

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
		}

		@Test(priority = 8)
		public static void LoginValid() throws InterruptedException {
        Thread.sleep(1000);
			driver.findElement(By.id("com.tss.nuronics:id/close_img")).click();
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etEmail")));
			driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys("isha@mailinator.com");

			WebDriverWait wait1 = new WebDriverWait(driver, 50);
			wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etPassword")));
			driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys("The@1234");

			WebDriverWait wait2 = new WebDriverWait(driver, 50);
			wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/btnSignin")));
			driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();

			Thread.sleep(5000);
			WebDriverWait wait3 = new WebDriverWait(driver, 50);
			wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.TextView")));

			String textofclass = driver.findElement(By.className("android.widget.TextView")).getText();

			// String h = driver.getPageSource();

			// driver.findElements(By.xpath("//)).size() > 0)

			if (textofclass.equalsIgnoreCase(text3)) {
				System.out.println(":::::::::::::::::::When user enter valid login details");
				System.out.println(textofclass);
				System.out.println("login success");

			} else {

				System.out.println(" login failed");
			}
		}

		 @Test(priority = 2)
		 public static void LoginInvalid() throws InterruptedException {

			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etEmail")));
			driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys("isfdfdha@mailinator.com");

			WebDriverWait wait1 = new WebDriverWait(driver, 50);
			wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etPassword")));
			driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys("The@123544");

			WebDriverWait wait2 = new WebDriverWait(driver, 50);
			wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/btnSignin")));
			driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();

			Thread.sleep(5000);
			WebDriverWait wait3 = new WebDriverWait(driver, 50);
			wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/forgot_pwd")));

			String textofclass1 = driver.findElement(By.id("com.tss.nuronics:id/forgot_pwd")).getText();

			// driver.findElements(By.xpath("//)).size() > 0)
			
			 if(textofclass1.equalsIgnoreCase(text5))
			  {
				 System.out.println("::::::::::::::::::::when user enter invalid login details");
				  System.out.println(textofclass1);
			  
			      System.out.println("login failed");
			  
			  
			  }
			  else {
				 
				  System.out.println("login done");
			  }
		}
        @Test(priority = 12)
		public static void LoginAfterupdating() throws InterruptedException {

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

			// driver.findElements(By.xpath("//)).size() > 0)

			if (textofclass.equalsIgnoreCase(text3)) {
				System.out.println(":::::::::::::::::::When user enter details after changing password");
				System.out.println(textofclass);
				System.out.println("login success");

			} else {

				System.out.println(" login failed");
			}

		}

		@Test(priority = 11)
		public static void logout() throws InterruptedException {

			//WebDriverWait wait4 = new WebDriverWait(driver, 100);
			//wait4.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

			//driver.findElement(By.className("android.widget.ImageButton")).click();
			WebDriverWait wait5 = new WebDriverWait(driver, 50);
			wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.tss.nuronics:id/btn_logout")));

			driver.findElement(By.id("com.tss.nuronics:id/btn_logout")).click();
			Thread.sleep(1000);

			String textofalert = driver.switchTo().alert().getText();
			System.out.println(textofalert);
			driver.switchTo().alert().accept();

			WebDriverWait wait7 = new WebDriverWait(driver, 50);

			wait7.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.tss.nuronics:id/btnSignin")));

			if (driver.findElements(By.id("com.tss.nuronics:id/btnSignin")).size() > 0) {

				System.out.println("logout success");
			} else {
				System.out.println("logout failed");

			}
		}

		 @Test(priority = 1)
		 public void Invalidemailid() {

			WebDriverWait wait11 = new WebDriverWait(driver, 100);
			wait11.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etEmail")));
			driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys("isha");

			WebDriverWait wait12 = new WebDriverWait(driver, 100);
			wait12.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etPassword")));
			driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys("The@1234");

			WebDriverWait wait23 = new WebDriverWait(driver, 100);
			wait23.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/btnSignin")));
			driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();

			WebDriverWait wait33 = new WebDriverWait(driver, 100);
			wait33.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.TextView")));

			String textofclass1 = driver.findElement(By.id("com.tss.nuronics:id/username_error")).getText();
			// String textofclass2=
			// driver.findElement(By.className("android.widget.TextView")).getText();

			// driver.findElements(By.xpath("//)).size() > 0)
			  if(textofclass1.equalsIgnoreCase(text4))
			  {
				  System.out.println("::::::::::::::::::::when user ENTER Invalid Emailid");
					System.out.println(textofclass1);
					System.out.println("login failed");
			  }else {
				  System.out.println("login success");
				  
			  }
			/*
			 * else if (textofclass2.equalsIgnoreCase(text5)){
			 * System.out.println("invalid text of password");
			 * System.out.println(textofclass2); }
			 */

		}

		 @Test(priority = 3)
		 public static void InavlidPassWord1() throws Exception {
			
			driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys("isha@mailinator.com");

			WebDriverWait wait12 = new WebDriverWait(driver, 100);
			wait12.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etPassword")));
			driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys("Th");

			WebDriverWait wait23 = new WebDriverWait(driver, 100);
			wait23.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/btnSignin")));
			driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
			Thread.sleep(3000);

	     //	String textofclass5=driver.findElement(By.className("android.widget.TextView")).getText();
			
	     	List<MobileElement> calcButtons = driver.findElements(By.xpath("//android.widget.TextView"));
			//Thread.sleep(1000);
	    	Thread.sleep(3000);
	     //	System.out.println(calcButtons.size());
	        String te =	calcButtons.get(0).getText();
	   
	 
	    // System.out.println(tex1);
	   //  System.out.println(tex);
	    	 Thread.sleep(3000);
			 System.out.println("::::::::::::::::::::when user ENTER Invalid Password Length");
			//  System.out.println(te);
			// assertEquals(te, "Password length should be min 8 characters");
			 if(te.contains("Password")) {
				 System.out.println(te);
				System.out.println("login failed");
			 }else {
				 
				 System.out.println("login success");
			 }
			/*
			 * else if (textofclass2.equalsIgnoreCase(text5)){
			 * System.out.println("invalid text of password");
			 * System.out.println(textofclass2); }
			 */
		}

		 @Test(priority = 4)
		 public static void LoginNull() {

			WebDriverWait wait11 = new WebDriverWait(driver, 100);
			wait11.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etEmail")));
			driver.findElement(By.id("com.tss.nuronics:id/etEmail")).sendKeys("");

			WebDriverWait wait12 = new WebDriverWait(driver, 100);
			wait12.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/etPassword")));
			driver.findElement(By.id("com.tss.nuronics:id/etPassword")).sendKeys("");

			WebDriverWait wait23 = new WebDriverWait(driver, 100);
			wait23.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/btnSignin")));
			driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();

			WebDriverWait wait33 = new WebDriverWait(driver, 100);
			wait33.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.tss.nuronics:id/username_error")));

			String textofclass4 = driver.findElement(By.id("com.tss.nuronics:id/username_error")).getText();
			String textofclass5 = driver.findElement(By.id("com.tss.nuronics:id/password_error")).getText();

			// driver.findElements(By.xpath("//)).size() > 0)
			// System.out.println(textofclass2);
			  
			  if (textofclass4.equalsIgnoreCase(text6))
			  {
				  System.out.println(":::::::::::::::::::when user ENTER NULL login  details");
					System.out.println(textofclass4);
					System.out.println(textofclass5);
					 System.out.println("login failed");
			  
			  }else {
				  System.out.println("login success");
			  }
		}

		 @Test(priority = 5)
		 public static void ForgotpasswordValid() throws InterruptedException {
			// driver.findElement(By.id("com.tss.nuronics:id/close_img")).click();
			Thread.sleep(1000);

			driver.findElement(By.id("com.tss.nuronics:id/forgot_pwd")).click();

			Thread.sleep(1000);
			String text9 = driver
					.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'title_textview')]")).getText();
			if (text9.contains("FORGOT")) {
				System.out.println(text9);
				System.out.println("::::::::::::::::::user in forgot password page checking with valid mail");
				Thread.sleep(1000);

				driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_email")).sendKeys("isha@mailinator.com");
				driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();

			} else {

				System.out.println("failed to go forgot password page");
			}
		}

		@Test(priority = 6)
		public static void ForgotpasswordInValid() throws InterruptedException {
			Thread.sleep(10000);
			driver.findElement(By.id("com.tss.nuronics:id/close_img")).click();
			Thread.sleep(1000);

			driver.findElement(By.id("com.tss.nuronics:id/forgot_pwd")).click();
			Thread.sleep(1000);

			String text9 = driver.findElement(By.id("com.tss.nuronics:id/title_textview")).getText();
		
				System.out.println(text9);
				System.out.println("::::::::::::::::::user in forgot password page checking with invalid mail");
				driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_email")).sendKeys("im");
				driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
				String tt=  driver.findElement(By.id("com.tss.nuronics:id/username_error")).getText();
				System.out.println(tt);
				 if(tt.contains("Enter")) {
				  
				  System.out.println("forgot password sending mail failed");
				  
		   }
		   else {
			   System.out.println("forgot password sending mail success");
			  
		   }
		}

		 @Test(priority = 7)
		public static void ForgotpasswordNull() throws InterruptedException {
			//Thread.sleep(1000);
			driver.findElement(By.id("com.tss.nuronics:id/close_img")).click();

			driver.findElement(By.id("com.tss.nuronics:id/forgot_pwd")).click();

			String text9 = driver.findElement(By.id("com.tss.nuronics:id/title_textview")).getText();


				System.out.println(text9);
				System.out.println("::::::::::::::::::user in forgot password page with Null data");
				driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_email")).sendKeys("");
				driver.findElement(By.id("com.tss.nuronics:id/btnSignin")).click();
				String ttt=	driver.findElement(By.id("com.tss.nuronics:id/username_error")).getText();
				if(ttt.contains("Email")) {
					System.out.println(ttt);
					  System.out.println("forgot password sending mail failed");
		   }
		   else {
			   System.out.println("forgot password sending mail success");
			  
		   }

		}

		 @Test(priority = 9)
		 public static void profile() throws InterruptedException {

			// LoginValid();
			Thread.sleep(2000);

			WebDriverWait wait4 = new WebDriverWait(driver, 100);
			wait4.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

			driver.findElement(By.className("android.widget.ImageButton")).click();

			WebDriverWait wait6 = new WebDriverWait(driver, 100);
			wait6.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//android.widget.TextView[contains(@resource-id,'textViewName') and @text='Profile']")));

			driver.findElement(
					By.xpath("//android.widget.TextView[contains(@resource-id,'textViewName') and @text='Profile']"))
					.click();

			if (driver.findElements(By.className("android.widget.TextView")).size() > 0) {

				System.out.println("user in PROfile page");
				Thread.sleep(1000);
				String data = driver.findElement(By.className("android.widget.TextView")).getText();
				System.out.println(data);

			} else {
				System.out.println("user  not in PROfile  page");

			}
			Thread.sleep(1000);
			driver.findElement(By.id("com.tss.nuronics:id/edit_icon_menu")).click();
			if (driver.findElements(By.className("android.widget.TextView")).size() > 0) {

				System.out.println("user in  EDIT PROfile page");
				String data1 = driver.findElement(By.className("android.widget.TextView")).getText();
				System.out.println(data1);

			} else {
				System.out.println("user  not in  EDIT PROfile  page");

			}
			Thread.sleep(1000);

			driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_name")).sendKeys("isha3");
			Thread.sleep(1000);
			driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_email")).sendKeys("isha@mailinator.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btnupdate') and @text='UPDATE']"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.id("com.tss.nuronics:id/edit_icon_menu")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_name")).sendKeys("");
			Thread.sleep(1000);
			driver.findElement(By.id("com.tss.nuronics:id/text_input_edit_email")).sendKeys("");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btnupdate') and @text='UPDATE']"))
					.click();
			Thread.sleep(1000);

			// WebDriverWait wait9 = new WebDriverWait(driver, 100);
			// wait9.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

			String nametext = driver
					.findElement(By.xpath("//android.widget.TextView[@text='Name should not be empty' and @index='1']"))
					.getText();

			String mailtext = driver
					.findElement(By.xpath("//android.widget.TextView[@text='Email should not be empty' and @index='3']"))
					.getText();
			System.out.println(nametext + " " + mailtext);

			Thread.sleep(1000);
			// driver.findElement(By.id("com.tss.nuronics:id/edit_icon_menu")).click();
			driver.findElement(By.id("com.tss.nuronics:id/btnclose")).click();
			Thread.sleep(1000);
			WebDriverWait wait0 = new WebDriverWait(driver, 100);
			wait0.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

			driver.findElement(By.className("android.widget.ImageButton")).click();

		}
        @Test(priority = 11)
		public static void actionsbtn() {
			WebDriverWait wait0 = new WebDriverWait(driver, 100);
			wait0.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

			driver.findElement(By.className("android.widget.ImageButton")).click();
			

		}
        @Test(priority = 10)
		public static void Changepassword() throws InterruptedException {

			Thread.sleep(1000);
			driver.findElement(By
					.xpath("//android.widget.TextView[contains(@resource-id,'textViewName') and @text='Change password']"))
					.click();
			Thread.sleep(1000);
			String textofpassword = driver
					.findElement(By.xpath("//android.widget.TextView[@text='Change password' and @index='1']")).getText();
			System.out.println(textofpassword);
			System.out.println(":::::::::::user in change password page");
			System.out.println("when user enter null data in change password ");
			driver.findElement(By.xpath(
					"//android.widget.EditText[contains(@resource-id,'text_input_edit_old_password') and @text='Old password']"))
					.sendKeys("");
			driver.findElement(By.xpath(
					"//android.widget.EditText[contains(@resource-id,'text_input_edit_new_password') and @text='New password']"))
					.sendKeys("");
			driver.findElement(By.xpath(
					"//android.widget.EditText[contains(@resource-id,'text_input_edit_confirm_password') and @text='Confirm Password']"))
					.sendKeys("");

			driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btnupdate') and @text='UPDATE']"))
					.click();
			Thread.sleep(1000);
			String oldpass = driver
					.findElement(
							By.xpath("//android.widget.TextView[@text='Old password should not be empty' and @index='1']"))
					.getText();
			String newpass = driver
					.findElement(
							By.xpath("//android.widget.TextView[@text='New password should not be empty' and @index='3']"))
					.getText();
			String confpass = driver
					.findElement(By.xpath(
							"//android.widget.TextView[@text='Confirm password should not be empty' and @index='5']"))
					.getText();
			System.out.println(oldpass);
			System.out.println(newpass);
			System.out.println(confpass);
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"//android.widget.EditText[contains(@resource-id,'text_input_edit_old_password') and @text='Old password']"))
					.sendKeys("The@1234");
			driver.findElement(By.xpath(
					"//android.widget.EditText[contains(@resource-id,'text_input_edit_new_password') and @text='New password']"))
					.sendKeys("The@12345");
			driver.findElement(By.xpath(
					"//android.widget.EditText[contains(@resource-id,'text_input_edit_confirm_password') and @text='Confirm Password']"))
					.sendKeys("The@12345");

			driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btnupdate') and @text='UPDATE']"))
					.click();
			
			

		}
        @Test(priority = 12)
		public static void settings() throws InterruptedException {
        	actionsbtn();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Settings' and @index='0']")).click();
			Thread.sleep(1000);

			String settingtext = driver.findElement(By.xpath("//android.widget.TextView[@text='సెట్టింగ్' and @index='1']"))
					.getText();
			System.out.println(settingtext);
			System.out.println("user in settings page");
			Thread.sleep(5000);

			// driver.findElement(By.className("android.widget.ImageView")).click();
			// Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'textview') and @text='Class II']")).click();
			Thread.sleep(1000);
			swipee();
			// driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'textview')
			// and @text='Class I']")).click();
			// String classtext =
			// driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'textview')
			// and @text='Class II']")).getText();

			// System.out.println(classtext);

			List<MobileElement> dd = driver.findElements(By.className("android.widget.TextView"));
			System.out.println(dd.size());
			System.out.println(dd.get(0).getText());
			System.out.println(dd.get(1).getText());
			System.out.println(dd.get(2).getText());
			System.out.println("settings update  success");
			Thread.sleep(1000);
			actionsbtn();
			logout();
			
	
			
			
			

		}

		public static void swipee() throws InterruptedException {

			MobileElement el = (MobileElement) driver.findElement(
					MobileBy.AndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView("
							+ "new UiSelector().textContains(\"UPDATE\"));"));
			el.click();
			Thread.sleep(10000);
			

		}
		@Test(enabled = false)
		public static void lessons() throws Exception {
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("android.widget.TextView")).click();
			Thread.sleep(5000);
		String d=	driver.findElement(By.id("com.tss.nuronics:id/title_textview")).getText();
		System.out.println(d);
		driver.findElement(By.id("com.tss.nuronics:id/record_img")).click();
		Thread.sleep(5000);
			swipee();
		//	driver.findElement(By.id("com.tss.nuronics:id/close_image")).click();
			Thread.sleep(10000);
			
		}

	}




