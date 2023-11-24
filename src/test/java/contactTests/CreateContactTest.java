package contactTests;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaUtility;
import genericUtilities.PropertyFileUtility;
import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactsInfoPage;
import objectRepository.ContactsPage;
import objectRepository.CreateNewContactPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
@Listeners(genericUtilities.ListenersImplementationClass.class)
public class CreateContactTest extends BaseClass {
	
	@Test(groups={"SmokeSuite","RegressionSuite"})
	
	public  void createContact() throws Throwable {
	/*	
		// TODO Auto-generated method stub
		//step1 :create all the required objects
		ExcelFileUtility eUtil = new ExcelFileUtility();
		PropertyFileUtility pUtil = new PropertyFileUtility();
		JavaUtility jUtil = new JavaUtility();
		WebDriverUtility wUtil = new WebDriverUtility();

		// Step 2: Read all the necessary Data
		String URL = pUtil.readDataFromPropertyFile("url");
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
	
		
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 7, 2)+jUtil.getRandomNumber();
		
		//WebDriver driver = null;
		

		//Step 3: Launch the Browser - RUNTIME POLYMORPHISM
		if(BROWSER.equalsIgnoreCase("chrome"))
		{ 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(BROWSER+" launched");
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println(BROWSER+" launched");
		}
		else if(BROWSER.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			System.out.println(BROWSER+" launched");
		}
		else
		{
			System.out.println("Invalid Browser Name");
		}
		

		wUtil.maximizewindow(driver);
		wUtil.waitForPageLoad(driver);
		driver.get(URL);
	
		//Step 4: Login to App
	//	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	//	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	//	driver.findElement(By.id("submitButton")).click();
		
		
		LoginPage lp=new LoginPage(driver);
		
		//lp.getUserNameEdt().sendKeys(USERNAME);
	//	lp.getPassWordEdt().sendKeys(PASSWORD);
		lp.getLoginBtn().click();
		*/
		
		
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 7, 2)+jUtil.getRandomNumber();
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsLink();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnContactLookUpImg();
//Assert.fail();



		// Step 11: Create contact
		CreateNewContactPage cncp = new CreateNewContactPage(driver);
		cncp.createNewContact(LASTNAME);
		
		// Step 12: Validate for contacts
		ContactsInfoPage cip = new ContactsInfoPage(driver);
		String ContactHeader = cip.getContactHeader();
		Assert.assertTrue(ContactHeader.contains(LASTNAME));
System.out.println(ContactHeader);
	}
//		if (ContactHeader.contains(LASTNAME)) {
//		System.out.println(ContactHeader + " --- PASS ---");
//		} else {
//		System.out.println(" ---- Failed ----");
//		}
//		
//		// Step 13: Logout
//		hp.logoutOfApp(driver);
//		System.out.println("Sign out successful");
//
//		// Step 11: close the browser
//		driver.quit();



@Test()
public void demo()
{
	System.out.println("this is sample");
	System.out.println("hello");
	
}


}
