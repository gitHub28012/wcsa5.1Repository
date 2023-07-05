package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	// to store generic reusable methods
	// all the methods are non static
	
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// provide the path of file
	    Workbook wb = WorkbookFactory.create(fis); // make the file for ready to read
	    Sheet sheet = wb.getSheet(sheetName);// get into the sheet
	    Row row = sheet.getRow(rowCount); // get into the desired row
	    Cell cell = row.getCell(cellCount);//get into the desired cell/column
	    String data = cell.getStringCellValue();// read the value from cell
	    return data;
	 
	}
  

}
