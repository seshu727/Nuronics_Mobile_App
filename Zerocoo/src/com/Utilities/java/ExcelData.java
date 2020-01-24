package com.Utilities.java;



import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


	public class ExcelData {		
			 static Workbook wb;
			 static FileOutputStream fo;
			
			public   ExcelData(String inputpath) throws Throwable{
				FileInputStream fi =new FileInputStream(inputpath);
				wb= WorkbookFactory.create(fi);
			}
			public int rowCount(String sheetname){
				
		      return wb.getSheet(sheetname).getLastRowNum();
			}
			public static int colCount(String sheetname,int row){
				return wb.getSheet(sheetname).getRow(row).getLastCellNum();	
			}
			public void paintColor( String sheetname,int row,int col ,String status,String outputpath){
				CellStyle style= wb.createCellStyle();
				Font font = wb.createFont();
				//style.getFillBackgroundColor();
				font.setColor(IndexedColors.BLUE.getIndex());
				font.setBold(true);
				style.setFont(font);
				wb.getSheet(sheetname).getRow(row).getCell(col).setCellStyle(style);	
				
			}
			public String getCellData1(String sheetname,int row,int col){
			
			
			  String data;
			  if(wb.getSheet(sheetname).getRow(row).getCell(col).getCellType()==Cell.CELL_TYPE_NUMERIC)
			  {
		
			int celldata=(int) wb.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
			  
			  data=String.valueOf(celldata);
			  }
			  else{
			  
			  data=wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue(); }
			  return data;
			}
			
			public void setCellData(String sheetname,int row,int col ,String status,String outputpath ) throws Throwable{
				
				wb.getSheet(sheetname).getRow(row).createCell(col).setCellValue(status);
				fo = new FileOutputStream(outputpath);
				wb.write(fo);
			
			}
			public String sheetName(int index){
				
				String Sname =wb.getSheetName(index);
				return Sname;
				
			}
			public int noOfSheets(){
				int numberofsheets =wb.getNumberOfSheets();
				return numberofsheets;
				
			}

		



	}
			


