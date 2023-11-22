package genericUtilities;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

/**
 * This class consists of generic methods related to property file to read the data
 * @author A
 * 
 */
public class PropertyFileUtility {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String readDataFromPropertyFile(String key) throws IOException
	{

        FileInputStream fisp= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		 Properties pObj=new Properties();
		pObj.load(fisp);
		String value=pObj.getProperty(key);
		return value;
	}
	
}

