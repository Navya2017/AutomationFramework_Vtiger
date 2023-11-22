package VtigerPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws Throwable, IOException {
		
		// Step 1:open the document in java readable format
				FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");

				//step2:create a workbook
				Workbook wb=WorkbookFactory.create(fis);

				//step 3:get control over a sheet
				Sheet sh=wb.getSheet("Contacts");

				   //step 4:get control over a row
				Row rw=sh.createRow(10);

				//step 5:get control over a cell
				Cell ce=rw.createCell(10);

				//step 6:read the data inside the cell
				ce.setCellValue("Navya");
				System.out.println("Data added");

				FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");

		wb.write(fos);
		
		wb.close();
		
	}

}
