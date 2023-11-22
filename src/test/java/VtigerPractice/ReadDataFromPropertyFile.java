package VtigerPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
	
		//step1:read the data in java readable foremat
		FileInputStream fisp = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		//step2:create object of propertis for java.util package
		Properties pObj = new Properties();
		
		
		//step3:load the file input stream into properties
		pObj.load(fisp);
		
		//step4:provide the key and read value
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(URL);
		
		String value = pObj.getProperty("brser");
		System.out.println(value);

	}

}
