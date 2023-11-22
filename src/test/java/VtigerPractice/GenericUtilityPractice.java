package VtigerPractice;

import java.io.IOException;

import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaUtility;
import genericUtilities.PropertyFileUtility;

public class GenericUtilityPractice {

	public static void main(String[] args) throws Throwable {
		
		PropertyFileUtility pUtil = new PropertyFileUtility();
		
		// Step 2: Read all the necessary Data
		String URL = pUtil.readDataFromPropertyFile("url");
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);
		
		ExcelFileUtility eUtil = new ExcelFileUtility();
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 1, 2);
		String ORGNAME = eUtil.readDataFromExcel("Organization", 4, 3);
		System.out.println(LASTNAME);
		System.out.println(ORGNAME);
		
		JavaUtility jUtil = new JavaUtility();
		int RandomNum=jUtil.getRandomNumber();
		System.out.println(RandomNum);
		
		
		String date=jUtil.getSystemDate();
		System.out.println(date);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
