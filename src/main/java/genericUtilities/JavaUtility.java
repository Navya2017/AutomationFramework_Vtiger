package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class consists of methods related to java
 * @author A
 *
 */
public class JavaUtility {
	/**
	 * This method will return random number after every run
	 * @return
	 */
		public int getRandomNumber()
		{
			Random ran=new Random();
			int r=ran.nextInt(10000);
			return r;
			
		}
		/**
		 * This method will return current system date in required format
		 * @return
		 */
		public String getSystemDate()
		{
			Date d=new Date();
			SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
			String date=formatter.format(d);
			return date;
		}
		
		
		
		
}
