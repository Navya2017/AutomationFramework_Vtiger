package VtigerPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario5 {

	public static void main(String[] args) {
		
		//Step 1: Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8888");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
//Step 2: Login to App
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();

//Step 3: Navigate to Contacts link
driver.findElement(By.linkText("Organizations")).click();

//Step 4: Click on Create contact Look up Image
driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

//Step 5: Create organization with mandatory Fields
driver.findElement(By.name("accountname")).sendKeys("Flipkart6");

//Step 6: Save
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//Step 7: Validate for Organization
String OrgHeader =driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
if(OrgHeader.contains("Flipkart5"))
{
System.out.println(OrgHeader+" ---- PASS ----");
}
else
{
System.out.println(" ---- Failed ----");
}

//Step 10: Navigate Contacts Link
driver.findElement(By.linkText("Contacts")).click();

//Step 11: Click on create Contact Look Up Image
driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

//Step 12: Create contact
driver.findElement(By.name("lastname")).sendKeys("abd");

//Step 13: Click on Org look up Image
driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img[@alt='Select']")).click();

//step 1:capture all window ids


		Set<String> winIds=driver.getWindowHandles();

	//step 2:use a for each loop and navigate it to each window
		for(String win:winIds)
		{
			//step 3:capture the title of each window
			String currentTitle=driver.switchTo().window(win).getTitle();
			
			//step 4:compare the current title with partial window title
			if(currentTitle.contains("Accounts"))
			{
				break;
			}
		}


//Step 14: switch the control to child window


//Step 15: search for Organization
driver.findElement(By.name("search_text")).sendKeys("Flipkart");
driver.findElement(By.name("search")).click();

//Step 16: choose the Organization
//driver.findElement(By.linkText(ORGNAME)).click();

driver.findElement(By.xpath("//a[text()='" + "Flipkart6" + "']")).click(); // dynamic xpath

//Step 17: switch the control back to main window

//Set<String> winIds=driver.getWindowHandles();

//step 2:use a for each loop and navigate it to each window
	for(String win:winIds)
	{
		//step 3:capture the title of each window
		String currentTitle=driver.switchTo().window(win).getTitle();
		
		//step 4:compare the current title with partial window title
		if(currentTitle.contains("Contacts"))
		{
			break;
		}
	}


//Step 8: Logout of app
		WebElement ele3 =driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele3).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		System.out.println("Sign out successful");
		driver.quit();

	}

}
