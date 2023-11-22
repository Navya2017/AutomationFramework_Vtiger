package VtigerPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelfile {

	public static void main(String[] args) throws IOException {
		
		// Step 1:open the document in java readable format
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");

		//step2:create a workbook
		Workbook wb=WorkbookFactory.create(fis);

		//step 3:get control over a sheet
		Sheet sh=wb.getSheet("Contacts");

		   //step 4:get control over a row
		Row rw=sh.getRow(1);

		//step 5:get control over a cell
		Cell ce=rw.getCell(2);

		//step 6:read the data inside the cell
		String value=ce.getStringCellValue();
		System.out.println(value);

		
		

	}

}
