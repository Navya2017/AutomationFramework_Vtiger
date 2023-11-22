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
import objectRepository.CreateNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.OrganizationsInfoPage;
import objectRepository.OrganizationsPage;
@Test(groups="RegressionSuite")



@Listeners(genericUtilities.ListenersImplementationClass.class)
public class CreateContactWithOrganizationTest extends BaseClass {

	public  void createContactWithOrganization() throws Throwable {
		/*
		// Step 1: Create all the required Objects
				JavaUtility jUtil = new JavaUtility();
				ExcelFileUtility eUtil = new ExcelFileUtility();
				PropertyFileUtility pUtil = new PropertyFileUtility();
				WebDriverUtility wUtil = new WebDriverUtility();
				WebDriver driver = null;

				// Step 2: Read The Required Data
				String BROWSER = pUtil.readDataFromPropertyFile("browser");
				String URL = pUtil.readDataFromPropertyFile("url");
				String USERNAME = pUtil.readDataFromPropertyFile("username");
				String PASSWORD = pUtil.readDataFromPropertyFile("password");

				String ORGNAME = eUtil.readDataFromExcel("Contacts", 7, 3) + jUtil.getRandomNumber();
				String LASTNAME = eUtil.readDataFromExcel("Contacts", 7, 2);

				// Step 3: Launch the browser
				if (BROWSER.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					System.out.println(BROWSER + " launched");
				} else if (BROWSER.equalsIgnoreCase("Firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					System.out.println(BROWSER + " launched");
				} else if (BROWSER.equalsIgnoreCase("Edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					System.out.println(BROWSER + " launched");
				} else {
					System.out.println("Invalid Browser Name");
				}

				wUtil.maximizewindow(driver);
				wUtil.waitForPageLoad(driver);

				// Step 4: Load the URL
				driver.get(URL);
				
				//Step 5: Login To Application
				LoginPage lp = new LoginPage(driver);
				lp.loginToApp(USERNAME, PASSWORD);
*/
		
		String ORGNAME = eUtil.readDataFromExcel("Contacts", 7, 3) + jUtil.getRandomNumber();
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 7, 2);
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganizationLink();

		// Step 6: Click on Create Organization Look up Image
		OrganizationsPage op = new OrganizationsPage(driver);
		op.clickOnCreateOrganizationLookUpImg();

		// Step 7: Create organization with mandatory Fields
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createNewOrganization(ORGNAME);
		cnop.getSaveBtn().click();
		// Step 8: Validate for Organization
		OrganizationsInfoPage oip = new OrganizationsInfoPage(driver);
		String OrgHeader = oip.getOrganizationHeader();
		Assert.assertTrue(OrgHeader.contains(ORGNAME));
		System.out.println(OrgHeader);

		//if (OrgHeader.contains(ORGNAME)) {
		//System.out.println(OrgHeader + " --- Organization Created ---");
		//} else {
		//System.out.println(" ----Organization creation Failed ----");
		//}

		// Step 9: Navigate Contacts Link
		hp.clickOnContactsLink();

		// Step 10: Click on create Contact Look Up Image
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnContactLookUpImg();

		// Step 11: Create contact
		CreateNewContactPage cncp = new CreateNewContactPage(driver);
		cncp.createNewContact(driver, LASTNAME, ORGNAME);
		wUtil.captureScreenShot(driver, "Screenshot1");

		// Step 12: Validate for contacts
		ContactsInfoPage cip = new ContactsInfoPage(driver);
		String ContactHeader = cip.getContactHeader();
		Assert.assertTrue(ContactHeader.contains(LASTNAME));
System.out.println(ContactHeader);


		//if (ContactHeader.contains(LASTNAME)) {
		//System.out.println(ContactHeader + " --- PASS ---");
		//} else {
		//System.out.println(" ---- Failed ----");
		//}
		/*
		// Step 13: Logout
		hp.logoutOfApp(driver);
		System.out.println("Sign out successful");

		// Step 11: close the browser
		driver.quit();
		*/
		
		
				
				
	}

}
