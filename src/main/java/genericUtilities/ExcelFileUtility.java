package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




/**
 * this class consists of generic methods related to excel sheet
 * @author A
 *
 */
public class ExcelFileUtility {
	/**
	 * this method will read data from excel sheet
	 * 
	 * @param SheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws IOException
	 */
		public String readDataFromExcel(String SheetName,int rowNo,int cellNo) throws IOException
		{
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			String value=wb.getSheet(SheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
			return value;
		}
		
		/**
		 * This method is usede to read data from excel using dataprovider
		 * @param SheetName
		 * @return
		 * @throws IOException
		 */
		public Object[][] readDataFromExcelToDataProvider(String SheetName) throws IOException
		{
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh1=wb.getSheet(SheetName);
			
			int lastRow=sh1.getLastRowNum();
			int lastCell=sh1.getRow(0).getLastCellNum();
			
			Object[][] data=new Object[lastRow][lastCell];
			for (int i=0;i<lastRow;i++)
			{
				for(int j=0;j<lastCell;j++)
				{
					data[i][j]=sh1.getRow(i+1).getCell(j).getStringCellValue();
				}
			}
			return data;
		}

		
}
