package mobile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class Toastmessages {
	
	
			
	static String scrShotDir = "screenshots";
	  File scrFile;
	  static File scrShotDirPath = new java.io.File("./"+ scrShotDir+ "//");
	  String destFile;
	  static AndroidDriver driver = null;
			

		 public String readToastMessage() throws TesseractException {
		String imgName = takeScreenShot();
		  String result = null;
		  File imageFile = new File(scrShotDirPath, imgName);
		  System.out.println("Image name is :" + imageFile.toString());
		  ITesseract instance = new Tesseract();

		  File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // Extracts
		                   // Tessdata
		                   // folder
		                   // from
		                   // referenced
		                   // tess4j
		                   // jar
		                   // for
		                   // language
		                   // support
		  instance.setDatapath(tessDataFolder.getAbsolutePath()); // sets tessData
		                // path

		  result = instance.doOCR(imageFile);
		  System.out.println(result);
		  return result;
		 }

		 /**
		  * Takes screenshot of active screen
		  * 
		  * @return ImageFileName
		  */
		 public String takeScreenShot() {
		  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 

		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  new File(scrShotDir).mkdirs(); // Create folder under project with name
		          // "screenshots" if doesn't exist
		  destFile = dateFormat.format(new Date()) + ".png"; // Set file name
		               // using current
		               // date time.
		  try {
		   FileUtils.copyFile(scrFile, new File(scrShotDir + "/" + destFile)); // Copy
		                    // paste
		                    // file
		                    // at
		                    // destination
		                    // folder
		                    // location
		  } catch (IOException e) {
		   System.out.println("Image not transfered to screenshot folder");
		   e.printStackTrace();
		  }
		  return destFile;
		 }
		
	}


