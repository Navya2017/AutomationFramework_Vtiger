package VtigerPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataToPropertyFile {

	public static void main(String[] args) throws Throwable {
		

		
		//step2:create object of propertis for java.util package
		Properties pObj = new Properties();
		
		
		//step3:load the file input stream into properties
		pObj.setProperty("username", "admin");
		pObj.setProperty("password", "admin");
		pObj.setProperty("url", "https:localhost:8080");
		pObj.setProperty("browser", "chrome");
		

		FileOutputStream fisp = new FileOutputStream(".\\src\\test\\resources\\CommonDataWrite.properties");
		pObj.store(fisp, "this is the common data");
		System.out.println("property file created");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
