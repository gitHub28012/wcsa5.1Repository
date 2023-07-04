package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// Read data from IPL Sheet..

		// implementation of read the data from excel
		//Read multiple values or data from excel sheet by using for loop

		for(int i=1;i<=10;i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide path of the file
			Workbook wb = WorkbookFactory.create(fis);// make the file ready for read.
			Sheet sheet = wb.getSheet("IPL");// get into the sheet
			Row row = sheet.getRow(i);// get into the desired row
			Cell cell = row.getCell(1);// get into the desired cell/column
			String data = cell.getStringCellValue();// read the value for cell
			Thread.sleep(2000);
			System.out.println(data);
		}
	}
}
