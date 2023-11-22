package organizationTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import objectRepository.CreateNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.OrganizationsInfoPage;
import objectRepository.OrganizationsPage;
@Test(groups="Smoke")

@Listeners(genericUtilities.ListenersImplementationClass.class)
public class CreateOrganizationTest extends BaseClass {

	public static void createOrganization() throws Throwable {
		/*
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
				
				
				String ORGNAME = eUtil.readDataFromExcel("Organization", 1, 2)+jUtil.getRandomNumber();
				
				WebDriver driver = null;
				 

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
				
				lp.getUserNameEdt().sendKeys(USERNAME);
				lp.getPassWordEdt().sendKeys(PASSWORD);
				lp.getLoginBtn().click();
				*/
		
		
		String ORGNAME = eUtil.readDataFromExcel("Organization", 1, 2)+jUtil.getRandomNumber();
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
				
				
//			if (OrgHeader.contains(ORGNAME)) {
//				System.out.println(OrgHeader + " --- Organization Created ---");
//				} else {
//			System.out.println(" ----Organization creation Failed ----");
//				}
//			
				// Step 9: Logout
			//	hp.logoutOfApp(driver);
				//System.out.println("Sign out successful");
				//step 10:close the browser
				//driver.quit();
			

				
				
	}

}
