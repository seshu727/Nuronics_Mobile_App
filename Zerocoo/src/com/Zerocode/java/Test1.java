package com.Zerocode.java;

import org.testng.annotations.Test;

import com.Utilities.java.ExcelData;

public class Test1 extends commonfun {

	static String des;
	static String obj;
	static String loc;
	static String locv;
	static String Td;
	static String sts;
	static String moduleone = "";

	@Test
	public static void Testing() throws Throwable  {

		String input = "C:\\Users\\PC\\Desktop\\appium1\\Zerocoo\\Excelinputdata\\data.xlsx";

		ExcelData d = new ExcelData(input);
		int rc = d.rowCount("Sheet1");
		//System.out.println(rc);

		for (int i = 1; i <= rc; i++) {

			des = d.getCellData1("Sheet1", i, 0);
			obj = d.getCellData1("Sheet1", i, 1);
			loc = d.getCellData1("Sheet1", i, 2);
			locv = d.getCellData1("Sheet1", i, 3);
			Td = d.getCellData1("Sheet1", i, 4);

			try {
				if (obj.equalsIgnoreCase("startBrowser")) {

					startBrowser();

				}
				

				
				if (obj.equalsIgnoreCase("openApplication")) {

					urlHitting();

				}

				
				if (obj.equalsIgnoreCase("waitForElement")) {

					WaitForFunctions(driver, loc, locv, Td);

				}
				if (obj.equalsIgnoreCase("typeAction")) {

					sendingData(driver, loc, locv, Td);

				}
				if (obj.equalsIgnoreCase("waitForElement")) {

					WaitForFunctions(driver, loc, locv, Td);

				}
				if (obj.equalsIgnoreCase("typeAction")) {

					sendingData(driver, loc, locv, Td);

				}
				if (obj.equalsIgnoreCase("clickAction")) {

				clickonButton(driver, loc, locv);

				}
				if (obj.equalsIgnoreCase("waitForElement")) {

					WaitForFunctions(driver, loc, locv, Td);

				}
				
				

				d.setCellData("Sheet1", i, 5, "PASS", input);
				d.paintColor("Sheet1", i, 5, "PASS", input);
				moduleone = "true";

				// break;
			} catch (Exception e) {
				d.setCellData("Sheet1", i, 5, "FAIL", input);
				d.paintColor("Sheet1", i, 5, "FAIL", input);
				moduleone = "false";
				break;
				

			}

		}
	}

}
